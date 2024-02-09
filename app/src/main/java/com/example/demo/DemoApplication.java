package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(final String[] args) {
		SpringApplication application = new SpringApplication(DemoApplication.class);
		application.run(args);
	}

}
