package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingService;
// ********* medium method for implementation ******
public class SetterInjectedController {

    public GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
