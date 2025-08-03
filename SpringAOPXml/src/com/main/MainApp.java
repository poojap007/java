package com.main;

import com.service.ShoppingService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");

        ShoppingService service = (ShoppingService) context.getBean("shoppingService");

        service.addToCart("Laptop");
        try {
            service.makePayment(0);  // triggers exception
        } catch (Exception e) {
            // handled by aspect
        }
        service.placeOrder();
    }
}
