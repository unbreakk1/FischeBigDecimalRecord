package unbreakk1BONUS;

import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        Client client1 = new Client("Alice", "Smith", "CUST001");
        Client client2 = new Client("Bob", "Johnson", "CUST002");

        // Create Account objects associated with Clients
        Account account1 = new Account("ACC001", new BigDecimal("5000.75"), client1);
        Account account2 = new Account("ACC002", new BigDecimal("1200.50"), client2);

        // Display account details
        System.out.println("== Initial Account Details ==");
        System.out.println(account1);
        System.out.println(account2);

        // Modify account balance for account1
        account1.setAccountBalance(account1.getAccountBalance().add(new BigDecimal("1000.25"))); // Add 1000.25
        System.out.println("\nAfter Updating Account1 Balance:");
        System.out.println(account1);

        // Change customer for account2
        account2.setCustomer(client1); // Reassign account2's customer to client1
        System.out.println("\nAfter Updating Account2 Customer:");
        System.out.println(account2);

    }
}
