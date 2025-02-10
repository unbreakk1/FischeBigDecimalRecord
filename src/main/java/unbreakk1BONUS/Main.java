package unbreakk1BONUS;

import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args)
    {
        Client client1 = new Client("Alice", "Smith", "CUST001");

        // Create an Account object
        Account account1 = new Account("ACC001", new BigDecimal("2000.50"), client1);

        // Display initial account details
        System.out.println("Initial Account Details:");
        System.out.println(account1);

        // Deposit money
        System.out.println("\nDepositing 500.75...");
        account1.deposit(new BigDecimal("500.75"));
        System.out.println("Updated Account Details:");
        System.out.println(account1);

        // Withdraw money
        System.out.println("\nWithdrawing 1000.25...");
        account1.withdraw(new BigDecimal("1000.25"));
        System.out.println("Updated Account Details:");
        System.out.println(account1);

        // Attempt to withdraw more than the balance
        try {
            System.out.println("\nAttempting to withdraw 3000.00...");
            account1.withdraw(new BigDecimal("3000.00"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Attempt to deposit a negative amount
        try {
            System.out.println("\nAttempting to deposit -100...");
            account1.deposit(new BigDecimal("-100"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
