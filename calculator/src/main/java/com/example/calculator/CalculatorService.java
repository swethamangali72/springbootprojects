package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	@Autowired
	private CalculatorRepository calculatorRepository;
	public int add(int a ,int b) {
		int result=a + b;
		calculatorRepository.save(new Calculator(a,b,"add",result));
		return result;
	}
	public int subtract(int a ,int b) {
		int result=a - b;
		calculatorRepository.save(new Calculator(a,b,"subtract",result));
		return result;
	}
}
