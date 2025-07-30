package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    @Test
    void testPaymentCalledOnce() {
        PaymentService payment = mock(PaymentService.class);
        OrderService order = new OrderService(payment);
        order.placeOrder();
        verify(payment, times(1)).processPayment();
    }
}
