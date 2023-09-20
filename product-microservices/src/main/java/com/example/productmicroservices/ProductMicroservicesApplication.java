package com.example.productmicroservices; // Update with your actual package name


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = { "com.example.productmicroservices.*"})
public class ProductMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMicroservicesApplication.class, args);
    }
}
