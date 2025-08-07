package com.example.groceryapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.List;

@RestController
public class GroceryController {

    @GetMapping("/grocery/public")
    public String publicMessage() {
        return "Welcome to the public grocery API!";
    }

    @GetMapping("/grocery/items")
    public List<String> getItems() {
        return List.of("Milk", "Bread", "Eggs");
    }

    @GetMapping("/grocery/orders")
    @PreAuthorize("hasRole('ADMIN')")
    public List<String> getOrders() {
        return List.of("Order1", "Order2", "Order3");
    }
}
