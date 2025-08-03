package com.wipro.springdemo;

public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    private Bank bank;

    public Account(int accountNumber, String accountHolderName, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bank = bank;
    }

    public void printDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance       : " + balance);
        System.out.println(bank.getDetails());
    }

}
