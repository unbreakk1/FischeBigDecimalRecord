package unbreakk1BONUS;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BankService
{

    private final List<Account> accounts = new ArrayList<>(); // Stores all accounts in the bank

    // Method to add accounts to the bank's storage for testing purposes
    public void addAccount(Account account)
    {
        accounts.add(account);
    }

    // Method to split a joint account into individual accounts
    public List<String> split(String accountNumber)
    {
        // Find the joint account
        Account jointAccount = accounts.stream()
                .filter(account -> account.getAccountNumber().equals(accountNumber))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Account not found."));

        // Get details of the joint account
        BigDecimal balance = jointAccount.getAccountBalance();
        List<Client> customers = jointAccount.getCustomers();

        if (customers.size() < 2)
        {
            throw new IllegalArgumentException("Account must have two or more holders to split.");
        }

        // Calculate equal split
        int numCustomers = customers.size();
        BigDecimal[] splitResult = balance.divideAndRemainder(BigDecimal.valueOf(numCustomers));
        BigDecimal individualShare = splitResult[0];   // Equal portion for each customer
        BigDecimal remainder = splitResult[1];         // Remainder (e.g., cents that don't divide evenly)

        // Create new individual accounts for each customer
        List<String> newAccountNumbers = new ArrayList<>();
        for (int i = 0; i < numCustomers; i++)
        {
            // Each customer gets their share; the first few get an extra cent if there's a remainder
            BigDecimal finalShare = individualShare;
            if (remainder.compareTo(BigDecimal.ZERO) > 0)
            {
                finalShare = finalShare.add(BigDecimal.ONE);  // Add 1 cent to the share
                remainder = remainder.subtract(BigDecimal.ONE);
            }

            // Create new account for customer
            Account individualAccount = new Account(
                    generateNewAccountNumber(), finalShare, List.of(customers.get(i))
            );
            accounts.add(individualAccount);
            newAccountNumbers.add(individualAccount.getAccountNumber());
        }

        // Remove the original joint account after splitting
        accounts.remove(jointAccount);

        // Return new account numbers
        return newAccountNumbers;
    }

    // Helper method to generate a unique account number
    private String generateNewAccountNumber()
    {
        return "ACC" + (accounts.size() + 1);
    }
}