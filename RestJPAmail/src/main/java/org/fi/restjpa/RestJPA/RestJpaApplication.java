package org.fi.restjpa.RestJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= {
		"org.fi.restjpa.RestJPA.controllers",
		"org.fi.restjpa.RestJPA.services"
		})
@EnableJpaRepositories(basePackages={"org.fi.restjpa.RestJPA.repository"})
@EntityScan(basePackages= {"org.fi.restjpa.RestJPA.entity"})
public class RestJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestJpaApplication.class, args);
	}

}
