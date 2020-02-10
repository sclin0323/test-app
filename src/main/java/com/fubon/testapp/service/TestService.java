package com.fubon.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	
	public String test() {
		
		System.out.print("test....");

		
		//System.out.print("Roles Size:"+roles.size());
		
		return "Roles Size:";
	}

}
