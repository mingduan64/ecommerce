package com.example.productmicroservices.services;

import com.example.productmicroservices.entities.Product;
import com.example.productmicroservices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Example business logic method
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // You can add more methods here to perform business logic
}
