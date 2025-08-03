package com.wipro.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("deprecation") // XmlBeanFactory is deprecated in newer versions
public class MainApp {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Account account = (Account) factory.getBean("account");
        account.printDetails();
    }
}
