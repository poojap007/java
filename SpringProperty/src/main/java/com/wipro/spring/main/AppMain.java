package com.wipro.spring.main;

import com.wipro.spring.config.AppConfig;
import com.wipro.spring.service.CredentialService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CredentialService credentialService = context.getBean(CredentialService.class);
        credentialService.displayCredentials();
    }
}
