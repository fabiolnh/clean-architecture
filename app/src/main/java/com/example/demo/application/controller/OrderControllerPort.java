package com.example.demo.application.controller;

import com.example.demo.adapters.inbound.rest.dto.OrderRequest;
import com.example.demo.adapters.inbound.rest.dto.OrderResponse;

public interface OrderControllerPort {

    OrderResponse createOrder(OrderRequest createOrderRequest);

}
