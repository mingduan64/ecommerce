package com.example.productmicroservices; // Update with your actual package name


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan(basePackages = { "com.example.productmicroservices.*"})
@EnableJpaRepositories(basePackages = "com.example.productmicroservices.repositories")
@EnableAutoConfiguration(exclude = SecurityAutoConfiguration.class)
public class ProductMicroservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductMicroservicesApplication.class, args);
    }
}
