package com.example.crudPrueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.crudPrueba")
@SpringBootApplication
public class CrudPrueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudPrueApplication.class, args);
	}

}
