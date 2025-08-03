package com.example.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertiesBean {
    @Value("${my.name:Default Name}")
    private String name;

    public void print() {
        System.out.println("Name from properties: " + name);
    }
}
