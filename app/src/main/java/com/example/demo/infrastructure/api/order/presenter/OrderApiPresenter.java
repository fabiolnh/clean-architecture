package com.example.demo.infrastructure.api.order.presenter;

import com.example.demo.application.usecase.order.FindOrder;
import com.example.demo.infrastructure.api.order.dto.OrderRequest;
import com.example.demo.infrastructure.api.order.dto.OrderResponse;

public abstract class OrderApiPresenter {

  public static OrderResponse toOrderResponse(FindOrder.Output outputFindOrderDTO) {
    return new OrderResponse(outputFindOrderDTO.id());
  }

  public static FindOrder.Input toInputFindOrderDTO(OrderRequest orderRequest) {
    return new FindOrder.Input(orderRequest.getName());
  }
}
