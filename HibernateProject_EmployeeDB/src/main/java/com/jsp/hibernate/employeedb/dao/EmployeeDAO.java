package com.jsp.hibernate.employeedb.dao;



import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.employeedb.entity.Employee;

public class EmployeeDAO {
	public static Session getSession() {
		 
		 Configuration conn = new Configuration();
		    conn.configure();
		    conn.addAnnotatedClass(Employee.class);
		    SessionFactory sf=conn.buildSessionFactory();
		    Session session = sf.openSession();
		 
		return session;
		 
	 }
	
	public void addEmployee(Scanner scanner){
		Employee employee = new Employee();
		System.out.println("Enter Id, Name ,Email, Age,Description , Salary");
		employee.setEmployeeId(scanner.nextInt());
		employee.setEmployeename(scanner.nextLine());
		employee.setEmployeeemail(scanner.nextLine());
		employee.setemployeeAge(scanner.nextInt());
		employee.setEmployeesalary(scanner.nextInt());
		
		
		Session session = getSession();
		Transaction transaction =session.beginTransaction();
		
		session.save(employee);
		
		transaction.commit();
		session.close();
		
	}
	
	public void findEmployeeById(Scanner scanner) {
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		
	
		System.out.println("Enter  Employee Id:");
		int employeeId= scanner.nextInt();
		
		Employee  employee = session.get(Employee.class, employeeId);
		System.out.println(employee);
		
		transaction.commit();
		session.close();
		
	}
	
	 public void updateEmployeeDescAndSalaryById(Scanner scanner){
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		
		System.out.println("Enter  Employee Id:");
		int employeeId= scanner.nextInt();
		
		
		Employee  employee = session.load(Employee.class, employeeId);
		
		System.out.println("Enter New Description and Salary :");
		employee.setEmployeedesc(scanner.nextLine());
		employee.setEmployeesalary(scanner.nextInt());
		
		session.update(employee);
		
		transaction.commit();
		session.close();
		
		
		
	}
	
	public void deleteEmployeeById(Scanner scanner) {
		
		Session session = getSession();
		Transaction transaction = session.beginTransaction();
		
		
		System.out.println("Enter  Employee Id:");
		int employeeId= scanner.nextInt();
		
		Employee employee = session.load(Employee.class, employeeId);
		
		session.delete(employee);
		
		transaction.commit();
		session.close();
		
	}

}
