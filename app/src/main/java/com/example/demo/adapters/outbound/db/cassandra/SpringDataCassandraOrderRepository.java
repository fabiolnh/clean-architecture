package com.example.demo.adapters.outbound.db.cassandra;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataCassandraOrderRepository extends CassandraRepository<CassandraOrder, UUID> {
}
