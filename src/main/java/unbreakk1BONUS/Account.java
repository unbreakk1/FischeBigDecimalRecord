package unbreakk1BONUS;

import java.math.BigDecimal;

public class Account
{
    private String accountNumber;      // Account Number
    private BigDecimal accountBalance; // Account Balance
    private Client customer;           // Associated Client


    public Account(String accountNumber, BigDecimal accountBalance, Client customer) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customer = customer;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {return accountNumber;}

    public void setAccountNumber(String accountNumber) {this.accountNumber = accountNumber;}

    // Getter and Setter for accountBalance
    public BigDecimal getAccountBalance() {return accountBalance;}

    public void setAccountBalance(BigDecimal accountBalance) {this.accountBalance = accountBalance;}

    // Getter and Setter for customer
    public Client getCustomer() {return customer;}

    public void setCustomer(Client customer) {this.customer = customer;}

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customer=" + customer +
                '}';
    }

}
