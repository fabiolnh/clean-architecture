package com.example.demo.infrastructure.db.order.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.UUID;

// Clean Architecture: Interface Adapter
@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity(name = "Order")
public class OrderEntity {

    @Id
    @Column
    UUID id;

    @Column
    String name;
}
