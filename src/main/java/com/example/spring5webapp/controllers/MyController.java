package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
//        System.out.println("hello world");
        return greetingService.sayGreeting();
    }
}
