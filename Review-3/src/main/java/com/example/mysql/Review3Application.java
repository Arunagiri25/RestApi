package com.example.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "one to many",
				version = "1.1.2",
				description = "mapping Project",
				contact = @Contact(
						name = "Arunagiri",
						email = "727821tuec024@skct.edu.in"
						)
				)
		)

public class Review3Application {

	public static void main(String[] args) {
		SpringApplication.run(Review3Application.class, args);
	}

}
