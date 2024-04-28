package com.example.demo.application.usecase.order;

import com.example.demo.domain.order.Order;
import com.example.demo.infrastructure.db.order.model.OrderEntity;
import com.example.demo.infrastructure.db.order.presenter.OrderDbPresenter;
import com.example.demo.infrastructure.db.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

// Clean Architecture: Use Case

@RequiredArgsConstructor
public class SaveOrder {

  final private OrderRepository orderRepository;

  public Output execute(Input input) {
    OrderEntity orderFromDatabase = orderRepository.findBy(input.name());
    if (orderFromDatabase != null) throw new RuntimeException("Order already exists");
    Order orderDomain = Order.create(input.name());
    OrderEntity orderEntity = OrderDbPresenter.createOrderEntityFromOrderDomain(orderDomain);
    OrderEntity orderAfterSaved = orderRepository.save(orderEntity);
    Output output = new Output(orderAfterSaved.getId(), orderAfterSaved.getName());
    return output;
  }

  public record Input(String name) {}
  public record Output(UUID id, String name) {}
}
