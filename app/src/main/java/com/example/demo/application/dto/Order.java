package com.example.demo.application.dto;

import com.example.demo.application.domain.OrderPort;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Order implements OrderPort {
    UUID id;
    String name;
}
