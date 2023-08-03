package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping(value = "/hello")
	public String getMessage() {
		String res =  "Hello World";
		return res;
	}
}
