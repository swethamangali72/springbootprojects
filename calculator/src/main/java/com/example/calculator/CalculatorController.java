package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
	@Autowired
	private CalculatorService calculatorService;
	@GetMapping("/add")
	public int add(@RequestParam int a,@RequestParam int b) {
		return calculatorService.add(a, b);
	}
	@GetMapping("/subtract")
	public int subtract(@RequestParam int a,@RequestParam int b) {
		return calculatorService.subtract(a, b);
	}
}
