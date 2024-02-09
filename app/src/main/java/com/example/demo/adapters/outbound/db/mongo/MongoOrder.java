package com.example.demo.adapters.outbound.db.mongo;

import com.example.demo.application.domain.OrderPort;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class MongoOrder implements OrderPort {

    private UUID id;
    private String name;

}
