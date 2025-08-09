package com.example.kafkademo.controller;

import com.example.kafkademo.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class MessageController {

    private final KafkaProducerService producerService;

    public MessageController(KafkaProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping("/publish/{message}")
    public String sendMessage(@PathVariable String message) {
        producerService.sendMessage(message);
        return "Message sent to Kafka: " + message;
    }
}
