package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${value}")
	private String name;
	@GetMapping("/")
	public String Api() {
		return "Hi"+name;
	}
}
