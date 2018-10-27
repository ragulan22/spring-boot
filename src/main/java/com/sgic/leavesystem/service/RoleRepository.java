package com.sgic.leavesystem.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.leavesystem.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	

}
