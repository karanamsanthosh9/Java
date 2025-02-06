package com.example.first_spring_boot_project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstSpringBootController {
    @RequestMapping(value="/")
    public String index()
    {
        return "Welcome to First spring boot application";
    }
}
