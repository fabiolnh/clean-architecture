package com.example.demo.adapters.inbound.rest.dto;

import com.example.demo.application.controller.dto.OrderRequestPort;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest implements OrderRequestPort {

    @NotNull private String name;
    @JsonCreator
    public OrderRequest(@JsonProperty("name") @NotNull final String name) {
        this.name = name;
    }

}
