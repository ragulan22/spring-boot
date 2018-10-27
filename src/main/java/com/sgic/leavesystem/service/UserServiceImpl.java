
package com.sgic.leavesystem.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sgic.leavesystem.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> readUser() {
		return userRepository.findAll();
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);	
	}

	@Override
	public void updateUser(User user,Integer id) {
		User existUser = userRepository.getOne(id);
		if(existUser.getId()!=null) {
			
		user.setId(id);
		userRepository.save(user);
		}
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
		
		
	}

}
