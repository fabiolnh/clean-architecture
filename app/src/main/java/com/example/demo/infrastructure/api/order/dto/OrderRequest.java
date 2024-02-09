package com.example.demo.infrastructure.api.order.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderRequest {

    @NotNull private String name;
    @JsonCreator
    public OrderRequest(@JsonProperty("name") @NotNull final String name) {
        this.name = name;
    }

}
