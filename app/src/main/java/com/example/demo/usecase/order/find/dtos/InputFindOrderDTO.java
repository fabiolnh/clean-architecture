package com.example.demo.usecase.order.find.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class InputFindOrderDTO {
  private String name;
}
