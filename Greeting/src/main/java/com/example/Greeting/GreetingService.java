package com.example.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	@Value("${app.greeting}")
	private String greetingMessage;
	public String getGreeting() {
		return greetingMessage;
	}
}