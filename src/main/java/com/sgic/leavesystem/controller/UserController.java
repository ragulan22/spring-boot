package com.sgic.leavesystem.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.leavesystem.entity.User;
import com.sgic.leavesystem.service.UserRepository;
import com.sgic.leavesystem.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/user")
	public List<User> viewUser(){
		return userService.readUser();
	}
	@PostMapping("/user")
	public void createUser(@RequestBody User user) {
		userService.createUser(user);
	}
	@PutMapping("/user/{id}")
	public void updateUser(@RequestBody User user,@PathVariable Integer id) {
		userService.updateUser(user, id);
	}
	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}
	
}
