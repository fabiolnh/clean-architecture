package com.example.demo.application.repository;

import com.example.demo.adapters.outbound.db.mongo.MongoOrder;
import com.example.demo.application.domain.OrderPort;

public interface OrderRepositoryPort {

    void save(OrderPort order);
}
