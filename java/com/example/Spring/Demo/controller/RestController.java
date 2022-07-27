package com.example.Spring.Demo.controller;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController()
public class RestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World ! Time on Server : "+LocalDateTime.now();
		
	}
	
	//epose a new endpoint for workout
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run hard 5k";
	}
	
	@GetMapping("/fortune")
	public String getFortune(){
		return "Today is your lucky Day";
	}

}
