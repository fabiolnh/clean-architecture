package com.example.demo.infrastructure.api.order.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class OrderResponse {

    private UUID id;

    public OrderResponse(final UUID id) {
        this.id = id;
    }

}
