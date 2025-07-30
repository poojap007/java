package com.example;

public class LoginService {
    public boolean validate(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return false;
        }
        return username.equals("admin") && password.equals("1234");
    }
}
