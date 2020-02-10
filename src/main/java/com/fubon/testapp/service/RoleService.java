package com.fubon.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.fubon.testapp.entity.Role;
import com.fubon.testapp.repository.RoleRepository;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class RoleService {
	
	 private static final Logger log = LogManager.getLogger(RoleService.class);
	
	
	@Autowired
	RoleRepository roleRepository;

	
	public List<Role> read() {
		
		List<Role> roles = roleRepository.findAll();
		
		for (Role o: roles) {
			log.info("roleId:"+o.getRoleId());
		}
		
		return roles;
	}
	
	public Role create(Role o) {
		
		roleRepository.save(o);
		
		return o;
	}
	
	public Role update(Role o) {
		
		return null;
	}
	
	public Role delete(Role o) {
		
		return null;
	}

}
