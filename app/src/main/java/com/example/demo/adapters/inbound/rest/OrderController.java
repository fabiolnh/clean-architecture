package com.example.demo.adapters.inbound.rest;

import com.example.demo.application.controller.OrderControllerPort;
import com.example.demo.adapters.inbound.rest.dto.OrderRequest;
import com.example.demo.adapters.inbound.rest.dto.OrderResponse;
import com.example.demo.application.domain.OrderPort;
import com.example.demo.application.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController implements OrderControllerPort {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public OrderResponse createOrder(@RequestBody final OrderRequest orderRequest) {
        final UUID id = orderService.createOrder(orderRequest);

        return new OrderResponse(id);
    }

}
