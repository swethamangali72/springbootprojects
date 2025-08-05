package com.example.SchedulingTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {
	@Scheduled(fixedRate=5000)
	public void printMessage() {
		System.out.println("Hello from scheduled task");
	}
}
