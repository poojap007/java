package com.example;

import com.example.beans.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        FirstSpringBootBean bean = context.getBean(FirstSpringBootBean.class);
        bean.display();

        PropertiesBean prop = context.getBean(PropertiesBean.class);
        prop.print();

        BikeBean vehicle = context.getBean(BikeBean.class);
        vehicle.start();

        Bank bank = context.getBean(Bank.class);
        bank.displayBranches();
    }
}
