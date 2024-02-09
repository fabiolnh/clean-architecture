package com.example.demo.adapters.outbound.db.mongo;

import com.example.demo.application.domain.OrderPort;
import com.example.demo.application.repository.OrderRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class MongoDbOrderRepository implements OrderRepositoryPort {

    private final SpringDataMongoOrderRepository orderRepository;

    @Autowired
    public MongoDbOrderRepository(final SpringDataMongoOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void save(OrderPort order) {
        orderRepository.save(new MongoOrder(order.getId(), order.getName()));
    }
}
