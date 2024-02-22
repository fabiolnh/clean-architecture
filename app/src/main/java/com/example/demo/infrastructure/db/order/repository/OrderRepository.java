package com.example.demo.infrastructure.db.order.repository;

import com.example.demo.domain.order.entity.Order;
import com.example.demo.infrastructure.db.order.model.OrderModel;

import java.util.UUID;

public class OrderRepository implements com.example.demo.domain.order.repository.OrderRepository<OrderModel> {

  public OrderModel findBy(String name) {
    // Need to implement manually the ORM or use some framework
    return new OrderModel(UUID.randomUUID(), "test");
  }
}
