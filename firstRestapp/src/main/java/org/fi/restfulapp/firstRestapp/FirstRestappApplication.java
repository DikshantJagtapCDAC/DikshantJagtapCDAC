package org.fi.restfulapp.firstRestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"org.fi.restfulapp.firstRestapp.controllers"})
public class FirstRestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstRestappApplication.class, args);
	}

}
