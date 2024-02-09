package com.example.demo.usecase.order.find;

import com.example.demo.infrastructure.db.order.model.OrderModel;
import com.example.demo.usecase.order.find.dtos.InputFindOrderDTO;
import com.example.demo.usecase.order.find.dtos.OutputFindOrderDTO;
import com.example.demo.infrastructure.db.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class FindOrderUseCase {

    final private OrderRepository orderRepository;

    public OutputFindOrderDTO execute(InputFindOrderDTO inputFindOrderDto) {
        OrderModel orderModel = orderRepository.findBy(inputFindOrderDto.getName());
        OutputFindOrderDTO output = new OutputFindOrderDTO(orderModel.getId(), orderModel.getName());
        return output;
    }
}
