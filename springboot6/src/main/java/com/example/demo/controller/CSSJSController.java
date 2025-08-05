package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSSJSController {

    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello, this is working!";
    }
}
