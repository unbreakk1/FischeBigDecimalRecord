package unbreakk1BONUS;

import java.math.BigDecimal;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        BankService bankService = new BankService();

        // Create Clients
        Client alice = new Client("Alice", "Smith", "CUST001");
        Client bob = new Client("Bob", "Johnson", "CUST002");

        // Create Accounts
        Account account1 = new Account("ACC001", new BigDecimal("1000.00"), List.of(alice));
        Account account2 = new Account("ACC002", new BigDecimal("500.00"), List.of(bob));
        Account jointAccount = new Account("ACC003", new BigDecimal("2000.00"), List.of(alice, bob));

        // Add Accounts to Bank
        bankService.addAccount(account1);
        bankService.addAccount(account2);
        bankService.addAccount(jointAccount);

        // Display Accounts Before Interest
        System.out.println("Accounts Before Credit Interest:");
        bankService.displayAccounts();

        // Credit Interest
        BigDecimal interestRate = new BigDecimal("5.0"); // 5% interest rate
        bankService.creditInterest(interestRate);

        // Display Accounts After Interest
        System.out.println("\nAccounts After Credit Interest:");
        bankService.displayAccounts();
    }

}

