package com.example.demo.infrastructure.api.order;

import com.example.demo.infrastructure.api.order.dto.OrderRequest;
import com.example.demo.infrastructure.api.order.dto.OrderResponse;
import com.example.demo.infrastructure.api.order.presenter.OrderApiPresenter;
import com.example.demo.application.usecase.order.FindOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final FindOrder findOrderUseCase;

    @Autowired
    public OrderController(FindOrder findOrderUseCase) {
        this.findOrderUseCase = findOrderUseCase;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<OrderResponse> findOrder(OrderRequest orderRequest) {
        FindOrder.Input input = OrderApiPresenter.toInputFindOrderDTO(orderRequest);
        FindOrder.Output output = findOrderUseCase.execute(input);
        OrderResponse orderResponse = OrderApiPresenter.toOrderResponse(output);
        return ResponseEntity.ok(orderResponse);
    }

}