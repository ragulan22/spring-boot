package com.sgic.leavesystem.service;

import java.util.List;

import com.sgic.leavesystem.entity.User;

public interface UserService {

	public List<User> readUser();
	public void createUser(User user);
	public void updateUser(User user,Integer id);
	public void deleteUser(Integer id);
	
}
