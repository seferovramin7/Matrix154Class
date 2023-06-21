package org.lessons.Lesson_11;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private double balance;

    // Constructor overloading
    public BankAccount() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.accountType = "";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolderName, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolderName, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Public methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    // Method overloading
    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        balance -= amount;
    }
}

