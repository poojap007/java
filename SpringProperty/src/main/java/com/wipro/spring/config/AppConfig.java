package com.wipro.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.wipro.spring")
@PropertySource("classpath:datafile.properties")
public class AppConfig {
}
