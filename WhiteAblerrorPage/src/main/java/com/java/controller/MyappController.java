package com.java.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyappController {
	
	@GetMapping(value="/")
	public String Hello() {
		
		return "hello from hari";
		
	}

}
