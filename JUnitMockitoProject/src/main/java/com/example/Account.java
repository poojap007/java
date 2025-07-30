package com.example;

public class Account {
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public String getId() { return id; }

    public void debit(double amount) { balance -= amount; }
    public void credit(double amount) { balance += amount; }
}
