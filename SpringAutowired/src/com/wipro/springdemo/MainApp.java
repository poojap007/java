package com.wipro.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Freshman freshman = (Freshman) context.getBean("freshman");
        freshman.showDetails();
    }
}
