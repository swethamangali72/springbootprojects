package com.example.helloworld;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	@Autowired
	private GreetingRepository greetingRepository;
	public String getStaticGreeting() {
		return "Hello, springboot";
	}
	public List<Greeting> getAllGreetings(){
		return greetingRepository.findAll();
	}
	public Greeting saveGreeting(String message) {
		return greetingRepository.save(new Greeting(null, message));
	}
}
