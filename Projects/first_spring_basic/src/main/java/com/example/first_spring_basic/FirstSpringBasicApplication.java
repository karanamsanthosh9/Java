package com.example.first_spring_basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBasicApplication.class, args);
		System.out.println("Hello world");
	}

}
