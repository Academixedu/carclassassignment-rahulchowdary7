package com.example;

// Starter code for Bank class
public class Bank {
    // Attributes
    private String bankName;
    public Bank(String bankName, String accountHolderName, String accountNumber, double balance) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    private String accountHolderName;
    public Bank(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    private String accountNumber;
    private double balance;

    // Add a constructor here
    // public Bank(String bankName, String accountHolderName, String accountNumber, double balance) { ... }

    // Add getter and setter methods here
    // public String getBankName() { ... }
    // public void setBankName(String bankName) { ... }
    // public String getAccountHolderName() { ... }
    // public void setAccountHolderName(String accountHolderName) { ... }
    // public String getAccountNumber() { ... }
    // public void setAccountNumber(String accountNumber) { ... }
    // public double getBalance() { ... }
    // public void setBalance(double balance) { ... }

    public String getBankName() {
        return bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        // TODO: Implement this method
        System.out.println("bankname" + bankName);
        System.out.println("holdername"+ accountHolderName);
        System.out.println("number"+ accountNumber);
        System.out.println("blance"+balance);
        

    }

    // Method to deposit money
    public void deposit(double amount) {
        // TODO: Implement this method

    }

    // Method to withdraw money
    public void withdraw(double amount) {
        // TODO: Implement this method
    }
}
