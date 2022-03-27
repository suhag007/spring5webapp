package com.example.spring5webapp.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello SetterinjectedGreeting";
    }
}
