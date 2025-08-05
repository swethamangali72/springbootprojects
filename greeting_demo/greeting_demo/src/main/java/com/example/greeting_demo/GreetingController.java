package com.example.greeting_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
	@Autowired
	private GreetingService greetingservice;
	@PostMapping
	public Greeting saveGreeting(@RequestParam String message) {
		return greetingservice.saveGreeting(message);
	}
	@GetMapping
	public List<Greeting> getGreeting(){
		return greetingservice.getAllGreetings();
	}
}
