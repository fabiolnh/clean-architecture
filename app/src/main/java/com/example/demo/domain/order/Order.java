package com.example.demo.domain.order;

import lombok.*;

import java.util.UUID;

// Clean Architecture: Entity

@Getter
@Setter
@Builder
public class Order {

  UUID id;
  String name;

  private Order(UUID id, String name) {
      if (this.name == null || this.name.isEmpty()) throw new IllegalArgumentException("Invalid name");
      this.name = name;
      this.id = id;
  }

  public static Order create(String name) {
    UUID id = UUID.randomUUID();
    return new Order(id, name);
  }

  public static Order restore(UUID id, String name) {
    return new Order(id, name);
  }



}
