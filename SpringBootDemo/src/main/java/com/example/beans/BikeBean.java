package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class BikeBean implements Vehicle {
    public void start() {
        System.out.println("Bike is starting...");
    }
}
