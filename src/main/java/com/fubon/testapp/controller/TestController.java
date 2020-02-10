package com.fubon.testapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fubon.testapp.entity.Role;
import com.fubon.testapp.service.RoleService;
import com.fubon.testapp.service.TestService;

@RestController
@RequestMapping(value="/api/test")
public class TestController {
	
	@Autowired
	TestService testService;
	
	@Autowired
	RoleService roleService;

	public String urlPrefix;
	
	// 正確的 CRUD 分頁 等機制
	
	@RequestMapping(value = "/read", method = RequestMethod.GET)
	public List<Role> read(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		
		return null;
	}
	/*
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public List<Role> create(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		List<Role> roles = roleService.read();
		
		return roles;
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public List<Role> update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		List<Role> roles = roleService.read();
		
		return roles;
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public Role delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		List<Role> roles = roleService.read();
		
		return roles;
	}
	*/

}
