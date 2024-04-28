package com.example.demo.infrastructure.db.order.repository;

import com.example.demo.infrastructure.db.order.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OrderRepository extends JpaRepository<OrderEntity, UUID> {

  OrderEntity findBy(String name);
}
