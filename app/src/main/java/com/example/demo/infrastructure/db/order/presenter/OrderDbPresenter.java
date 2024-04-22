package com.example.demo.infrastructure.db.order.presenter;

import com.example.demo.domain.order.Order;
import com.example.demo.infrastructure.db.order.model.OrderEntity;

// Clean Architecture: Interface Adapter

public class OrderDbPresenter {
  private OrderDbPresenter() {

  }
  public static OrderEntity createOrderEntityFromOrderDomain(Order orderDomain) {
    return OrderEntity.builder().name(orderDomain.getName()).build();
  }

  public static Order restoreOrderDomainFromOrderEntity(OrderEntity orderEntity) {
    return Order.restore(orderEntity.getId(), orderEntity.getName());
  }

}
