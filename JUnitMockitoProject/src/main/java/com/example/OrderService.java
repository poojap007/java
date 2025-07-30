package com.example;

public class OrderService {
    private final PaymentService service;
    public OrderService(PaymentService service) {
        this.service = service;
    }

    public void placeOrder() {
        service.processPayment();
    }
}
