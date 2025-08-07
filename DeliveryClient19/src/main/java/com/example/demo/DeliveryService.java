package com.example.demo;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryService {

    private static final String DELIVERY_SERVICE = "deliveryService";

    private final RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = DELIVERY_SERVICE, fallbackMethod = "fallbackStatus")
    public String getDeliveryStatus() {
        // Call external API
        return restTemplate.getForObject("http://localhost:8081/delivery/status", String.class);
    }

    // Fallback method if the external call fails
    public String fallbackStatus(Throwable t) {
        return "Delivery status temporarily unavailable. Please try again later.";
    }
}
