package com.example.FormSubmission;

import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

@Repository
public class FormRepository {
	private List<User> users=new ArrayList<>();
	public void save(User user) {
		users.add(user);
	}
	public List<User> findAll(){
		return users;
	}
	public void save(com.example.FormSubmission.User user) {
		// TODO Auto-generated method stub
		
	}
}
