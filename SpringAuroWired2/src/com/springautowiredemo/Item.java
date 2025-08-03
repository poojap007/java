package com.springautowiredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Item {
    private int id = 1;
    private String name = "Laptop";
    private double price = 75000.00;

    @Autowired
    private Category category;

    public void displayItemDetails() {
        System.out.println("Item ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category ID: " + category.getCategoryId());
        System.out.println("Category Name: " + category.getCategoryName());
    }
}
