package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingService;
import org.springframework.stereotype.Controller;

// ********  most prefered method of implementation of services. most clean method
@Controller
public class ConstructorInjectedController {
    
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
