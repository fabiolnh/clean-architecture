package com.example.demo.usecase.order.find;

import com.example.demo.usecase.order.find.dtos.InputFindOrderDTO;
import com.example.demo.usecase.order.find.dtos.OutputFindOrderDTO;
import com.example.demo.usecase.order.find.interfaces.OrderRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FindOrderUseCase {

    final private OrderRepository orderRepository;

    public OutputFindOrderDTO execute(InputFindOrderDTO inputFindOrderDto) {
        OutputFindOrderDTO output = new OutputFindOrderDTO(inputFindOrderDto.getId(), inputFindOrderDto.getName());
        return output;
    }
}
