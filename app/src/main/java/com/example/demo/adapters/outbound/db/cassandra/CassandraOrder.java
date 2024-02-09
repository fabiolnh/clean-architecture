package com.example.demo.adapters.outbound.db.cassandra;

import com.example.demo.application.domain.OrderPort;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CassandraOrder implements OrderPort {

    @PrimaryKey
    private UUID id;

    private String name;

}
