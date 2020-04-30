package com.itc.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itc.demo.model.EmployeeSignup;
import com.itc.demo.repository.EmployeeSignupRepository;

@Service
public class EmployeeSignupService {

	@Autowired
	EmployeeSignupRepository repository;
	
	
	public String saveSignupData(EmployeeSignup signup) {
		
		System.out.println("in service");
	Optional<EmployeeSignup> opObj = repository.findById(signup.getEmpPid());
		
	if(opObj.isPresent()) {
		System.out.println("in if");
		return "User already registered";
	}
	else {
		repository.save(signup);
		return "User registered sucessfully";
		
	}
		
		
	}
	
	public String validateLogin(String username, String password) {
		
		String msg = "";
		
		try {
			Optional<EmployeeSignup> opObj =	repository.findByEmpMail(username);
			
			EmployeeSignup empObj =  opObj.get();
			
			if(empObj.getPassword().equals(password)) {
				
				msg  ="Employee Login Sucessfull";
				
			}
			else {
				msg = "Employee Login Fail PLease check credentilas password";
			}
		}catch(Exception e) {
			
			msg = "Please check the username";
		}
		
	
	
	
		
		return msg;
	}
	
	
	
	
}
