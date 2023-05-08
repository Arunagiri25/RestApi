package com.example.mysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
		info =@Info(
				title = "Animals",
				version = "1.1.2",
				description = "Animal zoo Project",
				contact = @Contact(
						name = "Arunagiri",
						email = "727821tuec024@skct.edu.in"
						)
				)
		)
public class Review1Application {

	public static void main(String[] args) {
		SpringApplication.run(Review1Application.class, args);
	}

}
