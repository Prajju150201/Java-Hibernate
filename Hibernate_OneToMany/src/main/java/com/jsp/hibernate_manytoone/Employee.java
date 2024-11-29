package com.jsp.hibernate_manytoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	
	@ManyToOne
	private Company employee;
	
	
	
	
	
	public Company getEmployee() {
		return employee;
	}
	public void setEmployee(Company employee) {
		this.employee = employee;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
	
	
	
	

}
