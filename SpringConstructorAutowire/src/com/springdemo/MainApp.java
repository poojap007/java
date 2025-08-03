package com.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Purchase purchase = context.getBean("purchase", Purchase.class);
        purchase.displayDetails();
    }
}
/* 1. Generate Bill by entering code and quantity
2. Exit
1
Enter product_code: 1002
Enter quantity: 5
Product Name: 45000.0
Category: 45000.0
Description: 45000.0
Price: 45000.0
Quantity: 5
Total: Rs.225000.0
1. Generate Bill by entering code and quantity
2. Exit
2
Exiting...
*/