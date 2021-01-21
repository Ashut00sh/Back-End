package com.cdac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.repository.UserRepository;

import java.util.List;
import com.cdac.model.User;
@CrossOrigin(origins ="http://localhost:4200")
@RestController
public class UserController {
	@Autowired
	public UserRepository userrepository;
	//get all users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userrepository.findAll();
	}
	
	//create employee restapi
	@PostMapping("/users")
	 public User createUser(@RequestBody User u) {
		 return userrepository.save(u);
	 }
	
}
