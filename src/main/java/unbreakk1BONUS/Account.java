package unbreakk1BONUS;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Account
{
    private String accountNumber;             // Account Number
    private List<Transaction> transactions;  // List of all transactions
    private List<Client> customers;          // Associated Clients
    // Associated Client


    // Constructor
    public Account(String accountNumber, List<Client> customers) {
        this.accountNumber = accountNumber;
        this.transactions = new ArrayList<>(); // Initialize an empty list of transactions
        this.customers = customers;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter for customers
    public List<Client> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Client> customers) {
        this.customers = customers;
    }

    // Get all transactions (unmodifiable for immutability)
    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    // Add a transaction to the account
    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }


    // Method to deposit money into the account
    public void deposit(BigDecimal amount)
    {
        if (amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");

        this.accountBalance = this.accountBalance.add(amount);
    }

    // Method to withdraw money from the account
    public void withdraw(BigDecimal amount)
    {
        if (amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Withdrawal amount must be greater than zero.");

        if (this.accountBalance.compareTo(amount) < 0)
            throw new IllegalArgumentException("Insufficient balance for withdrawal.");

        this.accountBalance = this.accountBalance.subtract(amount);
    }

    @Override
    public String toString()
    {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customers=" + customers +
                '}';
    }

}
