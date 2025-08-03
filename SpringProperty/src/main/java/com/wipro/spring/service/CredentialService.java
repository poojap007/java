package com.wipro.spring.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CredentialService {

    @Value("${URL}")
    private String url;

    @Value("${username}")
    private String username;

    @Value("${password}")
    private String password;

    public void displayCredentials() {
        System.out.println("URL      : " + url);
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
}
