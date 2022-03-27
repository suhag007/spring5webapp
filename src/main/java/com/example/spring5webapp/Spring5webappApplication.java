package com.example.spring5webapp;

import com.example.spring5webapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

	ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

	}



}
