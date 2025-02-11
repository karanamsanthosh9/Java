package com.example.first_spring_boot_project;

import java.util.regex.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBoot.class, args);
		System.out.println("Hello world from SpringBoot day - 222");
		
		String s = "    Hello world from SpringBoot day - 5 hp" ;
		// String s = "";
		System.out.println(s);
		Pattern pat = Pattern.compile("[ ,-.]+");
		String st[] = pat.split(s.trim());
		for(String a : st)
			System.out.println(a);
	}
}


