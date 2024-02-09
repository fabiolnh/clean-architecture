package com.example.demo.adapters.inbound.rest.dto;

import com.example.demo.application.controller.dto.OrderResponsePort;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderResponse implements OrderResponsePort {

    private UUID id;

    public OrderResponse(final UUID id) {
        this.id = id;
    }

}
