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

        // Create a joint account
        Account jointAccount = new Account("ACC001", new BigDecimal("0.03"), List.of(alice, bob));
        bankService.addAccount(jointAccount);

        // Display initial account
        System.out.println("Initial Joint Account:");
        System.out.println(jointAccount);

        // Split the joint account
        System.out.println("\nSplitting the account...");
        List<String> newAccountNumbers = bankService.split("ACC001");

        // Display the new account numbers
        System.out.println("New Individual Account Numbers:");
        newAccountNumbers.forEach(System.out::println);
    }

}

