package com.jsp.hibernate.employeedb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String employeename;
	private String employeeemail;
	private int employeeage;
	private String employeedesc;
	private int employeesalary;
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeename=" + employeename + ", employeeemail="
				+ employeeemail + ", employeeage=" + employeeage + ", employeedesc=" + employeedesc
				+ ", employeesalary=" + employeesalary + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeeemail() {
		return employeeemail;
	}
	public void setEmployeeemail(String employeeemail) {
		this.employeeemail = employeeemail;
	}
	public int getEmployeeage() {
		return employeeage;
	}
	public void setEmployeeage(int employeeage) {
		this.employeeage = employeeage;
	}
	public String getEmployeedesc() {
		return employeedesc;
	}
	public void setEmployeedesc(String employeedesc) {
		this.employeedesc = employeedesc;
	}
	public int getEmployeesalary() {
		return employeesalary;
	}
	public void setEmployeesalary(int employeesalary) {
		this.employeesalary = employeesalary;
	}
	public void setemployeeAge(int nextInt) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
