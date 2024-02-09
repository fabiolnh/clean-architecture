package com.example.demo.infrastructure.db.order.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderModel {
    UUID id;
    String name;
}
