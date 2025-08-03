package com.example.config;

import com.example.beans.Bank;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyCollectionConfig {

    @Bean
    public Bank bank() {
        Bank bank = new Bank();
        bank.setBranches(Arrays.asList("Hyderabad", "Chennai", "Bangalore"));
        return bank;
    }
}
