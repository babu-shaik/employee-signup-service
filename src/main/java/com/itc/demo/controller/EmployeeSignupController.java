package com.itc.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itc.demo.model.EmployeeSignup;
import com.itc.demo.service.EmployeeSignupService;

@RestController
@RequestMapping("/api")
public class EmployeeSignupController {

	@Autowired
	EmployeeSignupService service;
	
	
	@PostMapping("/signup")
	public String employeeSignup(@RequestBody EmployeeSignup signup) {
		System.out.println("in controller");
		return service.saveSignupData(signup);
	
	}
	
	@PostMapping("/login/{username}/{password}")
	public String employeeLogin(@PathVariable("username") String username ,@PathVariable("password") String password) {
		
		return service.validateLogin(username, password);
	}
	
}
