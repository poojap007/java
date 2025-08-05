package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class AccountController {

    @GetMapping("/{id}/accounts")
    public List<String> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        List<String> accounts = new ArrayList<>();
        accounts.add("Account ID: " + id);
        accounts.add("Account Type: " + type);
        accounts.add("Account Status: " + status);
        return accounts;
    }
}
