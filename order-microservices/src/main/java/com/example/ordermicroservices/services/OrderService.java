package com.example.ordermicroservices.services;

import com.example.ordermicroservices.entities.Order;
import com.example.ordermicroservices.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Component
@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Optional<Order> updateOrder(Long id, Order updatedOrder) {
        Optional<Order> existingOrder = orderRepository.findById(id);
        if (existingOrder.isPresent()) {
            Order order = existingOrder.get();
            order.setName(updatedOrder.getName());
            order.setPrice(updatedOrder.getPrice());
            orderRepository.save(order);
            return Optional.of(order);
        } else {
            return Optional.empty();
        }
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
