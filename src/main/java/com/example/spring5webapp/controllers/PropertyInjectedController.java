package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingService;

public class PropertyInjectedController {
    // least prefered method for controller impl
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
