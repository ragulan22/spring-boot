package com.sgic.leavesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.leavesystem.entity.Role;
import com.sgic.leavesystem.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/role")
	public List<Role> viewRole(){
		return roleService.readRole();
		}
	
	@PostMapping("/role")
	public void createRole(@RequestBody Role role) {
		roleService.createRole(role);
	}
	
	

}
