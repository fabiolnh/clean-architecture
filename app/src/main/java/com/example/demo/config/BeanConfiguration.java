package com.example.demo.config;

import com.example.demo.DemoApplication;
import com.example.demo.application.repository.OrderRepositoryPort;
import com.example.demo.adapters.outbound.db.mongo.MongoDbOrderRepository;
import com.example.demo.adapters.outbound.db.mongo.SpringDataMongoOrderRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.cassandra.CassandraAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)

// Use if you want to work with Cassandra
//@EnableAutoConfiguration(exclude={
//        MongoDataAutoConfiguration.class,
//        MongoRepositoriesAutoConfiguration.class,
//        MongoAutoConfiguration.class})

// Use if you want to work with Mongo
@EnableAutoConfiguration(exclude={
        CassandraDataAutoConfiguration.class,
        CassandraRepositoriesAutoConfiguration.class,
        CassandraAutoConfiguration.class})
public class BeanConfiguration {

//
//    @Bean
//    @Primary
//    OrderRepository getRepository(SpringDataCassandraOrderRepository cassandraRepository) {
//        return new CassandraDbOrderRepository(cassandraRepository);
//    }

    @Bean
    @Primary
    OrderRepositoryPort getRepository(SpringDataMongoOrderRepository mongoRepository) {
        return new MongoDbOrderRepository(mongoRepository);
    }

}