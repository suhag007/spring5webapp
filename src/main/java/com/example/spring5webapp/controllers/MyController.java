package com.example.spring5webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("hello world");
        return "hi folks";
    }
}
