package com.itc.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeSignup")
public class EmployeeSignup {
	
	
	@Id
	@Column
	private Integer empPid;
	@Column
	private String empName;
	@Column
	private String empMail;
	@Column
	private String password;
	
	public EmployeeSignup() {
		super();
	}

	public EmployeeSignup(int empPid, String empName, String empMail, String password) {
		super();
		this.empPid = empPid;
		this.empName = empName;
		this.empMail = empMail;
		this.password = password;
	}

	public int getEmpPid() {
		return empPid;
	}

	public void setEmpPid(int empPid) {
		this.empPid = empPid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "EmployeeSignup [empPid=" + empPid + ", empName=" + empName + ", empMail=" + empMail + ", password="
				+ password + "]";
	}
	
	
	

}
