package com.sgic.leavesystem.service;

import java.util.List;

import com.sgic.leavesystem.entity.Role;

public interface RoleService {

	public List<Role> readRole();
	public void createRole(Role role);
	public void updateRole(Role role, Integer id);
	public void deleteRole(Integer id);
	
}
