package com.cg.capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.capstore")

public class DiscountApplicationMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscountApplicationMvcApplication.class, args);
	}
}
