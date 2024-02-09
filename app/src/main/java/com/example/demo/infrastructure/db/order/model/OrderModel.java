package com.example.demo.infrastructure.db.order.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderModel {

    @Id
    @Column
    UUID id;

    @Column
    String name;
}
