package com.java.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.java.controller"})
public class WhiteAblerrorPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhiteAblerrorPageApplication.class, args);
	}
}
