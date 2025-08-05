package com.example.helloworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {
	@Autowired
	private GreetingService greetingservice;
	@GetMapping("/hello")
	public String hello() {
		return "Hello, Springboot";
	}
	@GetMapping
	public List<Greeting> getAllGreetings(){
		return greetingservice.getAllGreetings();
	}
	@PostMapping
	public Greeting saveGreeting(@RequestParam String message) {
		return greetingservice.saveGreeting(message);
	}
}
