package com.itc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}
