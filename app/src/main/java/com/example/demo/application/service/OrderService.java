package com.example.demo.application.service;

import com.example.demo.application.controller.dto.OrderRequestPort;
import com.example.demo.adapters.outbound.db.mongo.MongoOrder;
import com.example.demo.application.domain.OrderPort;
import com.example.demo.application.dto.Order;
import com.example.demo.application.repository.OrderRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderRepositoryPort orderRepository;

    public OrderService(final OrderRepositoryPort orderRepository) {
        this.orderRepository = orderRepository;
    }

    public UUID createOrder(final OrderRequestPort orderRequestPort) {
        Order order = Order.builder().name(orderRequestPort.getName()).build();
        orderRepository.save(order);
        return order.getId();
    }

}
