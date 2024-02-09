package com.example.demo.infrastructure.api.order;

import com.example.demo.infrastructure.api.order.dto.OrderRequest;
import com.example.demo.infrastructure.api.order.dto.OrderResponse;
import com.example.demo.infrastructure.api.order.presenters.OrderPresenter;
import com.example.demo.usecase.order.find.FindOrderUseCase;
import com.example.demo.usecase.order.find.dtos.InputFindOrderDTO;
import com.example.demo.usecase.order.find.dtos.OutputFindOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final FindOrderUseCase findOrderUseCase;

    @Autowired
    public OrderController(FindOrderUseCase findOrderUseCase) {
        this.findOrderUseCase = findOrderUseCase;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderResponse> findOrder(OrderRequest orderRequest) {
        InputFindOrderDTO inputFindOrderDTO = OrderPresenter.toInputFindOrderDTO(orderRequest);
        OutputFindOrderDTO outputFindOrderDTO = findOrderUseCase.execute(inputFindOrderDTO);
        OrderResponse orderResponse = OrderPresenter.toOrderResponse(outputFindOrderDTO);
        return ResponseEntity.ok(orderResponse);
    }

}
