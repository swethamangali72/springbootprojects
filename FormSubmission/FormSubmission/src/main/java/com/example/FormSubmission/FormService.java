package com.example.FormSubmission;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormService {
	@Autowired
	private FormRepository formrepository;
	public String registerUser(User user) {
		formrepository.save(user);
		return "User Registered Successfully";
	}
}
