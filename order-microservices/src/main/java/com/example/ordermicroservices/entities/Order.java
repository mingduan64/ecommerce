package com.example.ordermicroservices.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
@Access(AccessType.FIELD)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

}

