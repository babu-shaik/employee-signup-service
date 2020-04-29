package com.itc.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itc.demo.model.EmployeeSignup;

@Repository
public interface EmployeeSignupRepository extends JpaRepository<EmployeeSignup, Integer> {

}
