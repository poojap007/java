package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class CarBean implements Vehicle {
    public void start() {
        System.out.println("Car is starting...");
    }
}
