package com.example.first_spring_boot_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBoot.class, args);
		System.out.println("Hello world from SpringBoot day - 2");
	}

}
