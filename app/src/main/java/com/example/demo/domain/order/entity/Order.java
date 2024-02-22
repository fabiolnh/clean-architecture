package com.example.demo.domain.order.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Order {

  UUID id;

  String name;
}
