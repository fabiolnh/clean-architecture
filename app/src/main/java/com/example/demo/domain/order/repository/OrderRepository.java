package com.example.demo.domain.order.repository;

public interface OrderRepository<T> {

  T findBy(String name);
}
