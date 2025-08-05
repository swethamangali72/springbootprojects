package com.example.FormSubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
	@Autowired
	private FormService formservice;
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		return formservice.registerUser(user);
	}
}
