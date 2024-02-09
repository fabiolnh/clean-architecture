package com.example.demo.adapters.outbound.db.cassandra;

import com.example.demo.adapters.outbound.db.mongo.MongoOrder;
import com.example.demo.application.domain.OrderPort;
import com.example.demo.application.repository.OrderRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CassandraDbOrderRepository implements OrderRepositoryPort {

    private final SpringDataCassandraOrderRepository orderRepository;

    @Autowired
    public CassandraDbOrderRepository(SpringDataCassandraOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(OrderPort order) {
        orderRepository.save(new CassandraOrder(order.getId(), order.getName()));
    }
}
