package unbreakk1BONUS;

import java.math.BigDecimal;
import java.util.List;

public class Account
{
    private String accountNumber;      // Account Number
    private BigDecimal accountBalance; // Account Balance
    private List<Client> customers;           // Associated Client


    public Account(String accountNumber, BigDecimal accountBalance, List<Client> customers) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customers = customers;
    }

    // Getters and Setters
    public String getAccountNumber() {return accountNumber;}

    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}

    public BigDecimal getAccountBalance() {return accountBalance;}

    public void setAccountBalance(BigDecimal accountBalance) {this.accountBalance = accountBalance;}

    public List<Client> getCustomers() {return customers;}

    public void setCustomers(List<Client> customers) {this.customers = customers;}

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
                ", customer=" + customer +
                '}';
    }

}
