package com.example.ZipkinPaymentService_SB;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping("/payment")
    public String makePayment() {
        return "Payment Successful";
    }
}
