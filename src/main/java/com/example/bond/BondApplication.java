package com.example.bond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class BondApplication {

	public static void main(String[] args) {
		SpringApplication.run(BondApplication.class, args);
	}
}
