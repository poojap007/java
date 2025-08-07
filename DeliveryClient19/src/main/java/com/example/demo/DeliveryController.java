package com.example.demo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeliveryController {

    private static final String CB_NAME = "deliveryCB";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/checkdelivery")
    @CircuitBreaker(name = CB_NAME, fallbackMethod = "fallbackDeliveryStatus")
    public String checkDelivery() {
        return restTemplate.getForObject("http://localhost:8081/delivery/status", String.class);
    }

    public String fallbackDeliveryStatus(Throwable t) {
        return "Fallback: Delivery service is currently unavailable.";
    }
}
