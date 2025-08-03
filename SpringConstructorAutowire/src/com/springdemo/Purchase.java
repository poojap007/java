package com.springdemo;

import java.util.Date;

public class Purchase {
    private int purchaseId;
    private Date purchaseDate;
    private Product product;

    public Purchase(int purchaseId, Date purchaseDate, Product product) {
        this.purchaseId = purchaseId;
        this.purchaseDate = purchaseDate;
        this.product = product;
    }

    public void displayDetails() {
        System.out.println("Purchase ID: " + purchaseId);
        System.out.println("Date: " + purchaseDate);
        System.out.println("Product: " + product);
    }
}
