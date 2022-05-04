package com.zensar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.zensar")
public class Application {

	public static void main(String[] args) {
		System.out.println("this is Running Application");
		SpringApplication.run(Application.class, args);
	}

}

