package org.fi.restfulapp.secondRestapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"org.fi.restfulapp.secondRestapp.controllers"})
public class SecondRestappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondRestappApplication.class, args);
	}

}
