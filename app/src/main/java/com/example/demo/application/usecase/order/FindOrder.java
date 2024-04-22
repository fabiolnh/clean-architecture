package com.example.demo.application.usecase.order;

import com.example.demo.domain.order.Order;
import com.example.demo.infrastructure.db.order.model.OrderEntity;
import com.example.demo.infrastructure.db.order.presenter.OrderDbPresenter;
import com.example.demo.infrastructure.db.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

// Clean Architecture: Use Case

@RequiredArgsConstructor
public class FindOrder {

    final private OrderRepository orderRepository;

    public Output execute(Input input) {
        OrderEntity orderFromDatabase = orderRepository.findBy(input.name());
        Order orderDomain = OrderDbPresenter.restoreOrderDomainFromOrderEntity(orderFromDatabase);
        Output output = new Output(orderDomain.getId(), orderDomain.getName());
        return output;
    }

    public record Input(String name) {}
    public record Output(UUID id, String name) {}
}
