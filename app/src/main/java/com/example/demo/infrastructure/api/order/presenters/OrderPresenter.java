package com.example.demo.infrastructure.api.order.presenters;

import com.example.demo.infrastructure.api.order.dto.OrderRequest;
import com.example.demo.infrastructure.api.order.dto.OrderResponse;
import com.example.demo.usecase.order.find.dtos.InputFindOrderDTO;
import com.example.demo.usecase.order.find.dtos.OutputFindOrderDTO;

public abstract class OrderPresenter {

  public static OrderResponse toOrderResponse(OutputFindOrderDTO outputFindOrderDTO) {
    return new OrderResponse(outputFindOrderDTO.getId());
  }

  public static InputFindOrderDTO toInputFindOrderDTO(OrderRequest orderRequest) {
    return new InputFindOrderDTO(orderRequest.getName());
  }
}
