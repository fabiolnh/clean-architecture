package com.example.demo.config;

import com.example.demo.DemoApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)
public class BeanConfiguration {

}