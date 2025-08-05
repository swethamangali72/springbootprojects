package com.example.greeting_demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	@Autowired
	private GreetingRepository greetingrepository;
	public Greeting saveGreeting(String message) {
		Greeting greeting=new Greeting(System.currentTimeMillis(),message);
		return greetingrepository.save(greeting);
	}
	public List<Greeting> getAllGreetings(){
		return greetingrepository.findAll();
	}
}
