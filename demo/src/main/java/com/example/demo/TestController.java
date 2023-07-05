package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getGreeting")
	public TestEntity getGreeting() {
		return new TestEntity("restaurent 1");
	}
	
}
