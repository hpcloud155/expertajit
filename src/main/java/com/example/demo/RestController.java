package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/hi")
	public String sayHi()
	{
		return "You are geart";
	}
}
