package com.example.greeting_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepository {
	private final List<Greeting> greetings=new ArrayList<>();
	public Greeting save(Greeting greeting) {
		greetings.add(greeting);
		return greeting;
	}
	public List<Greeting> findAll(){
		return greetings;
	}
}
