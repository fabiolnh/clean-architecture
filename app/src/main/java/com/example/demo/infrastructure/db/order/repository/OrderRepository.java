package com.example.demo.infrastructure.db.order.repository;

import com.example.demo.infrastructure.db.order.model.OrderModel;

public interface OrderRepository {

  OrderModel findBy(String name);
}
