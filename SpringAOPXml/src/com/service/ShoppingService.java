package com.service;

public class ShoppingService {
    public void addToCart(String item) {
        System.out.println("Added to cart: " + item);
    }

    public void makePayment(double amount) {
        if (amount <= 0) {
            throw new RuntimeException("Invalid payment amount");
        }
        System.out.println("Payment of Rs. " + amount + " processed.");
    }

    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }
}
