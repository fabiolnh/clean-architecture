package com.example.demo.application.domain;

import java.util.UUID;

public interface OrderPort {

    UUID getId();
    void setId(UUID id);
    String getName();
    void setName(String name);
}
