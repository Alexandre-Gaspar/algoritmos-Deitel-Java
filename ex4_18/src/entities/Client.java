package entities;

public class Client {
    
    private int accountNumber;
    private double initialBalance;
    private double totalItems;
    private double totalCreditInAMonth;
    private double creditLimit;

    public Client() {}

    public Client(int accountNumber, double initialBalance, double totalItems, double totalCreditInAMonth, double creditLimit) {
        this.accountNumber = accountNumber;
        this.initialBalance = initialBalance;
        this.totalItems = totalItems;
        this.totalCreditInAMonth = totalCreditInAMonth;
        this.creditLimit = creditLimit;
    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public double getTotalCreditInAMonth() {
        return totalCreditInAMonth;
    }

    public void setTotalCreditInAMonth(int totalCreditInAMonth) {
        this.totalCreditInAMonth = totalCreditInAMonth;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    /* public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    } */

    public double newBalance() {
        return this.getInitialBalance() + this.getTotalItems() - this.getCreditLimit();
    }

    @Override
    public String toString() {
        return String.format("New balance: %.2f", newBalance());
    }

}
