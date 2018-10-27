package com.sgic.leavesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.leavesystem.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public List<Role> readRole() {
		return roleRepository.findAll();
	}

	@Override
	public void createRole(Role role) {
		roleRepository.save(role);
		
	}

	@Override
	public void updateRole(Role role, Integer id) {
		role.setId(id);
		roleRepository.save(role);

	}

	@Override
	public void deleteRole(Integer id) {
		roleRepository.deleteById(id);;
		
	}

}
