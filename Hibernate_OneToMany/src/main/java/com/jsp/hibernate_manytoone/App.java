package com.jsp.hibernate_manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		Company company = new Company();
		company.setCompanyId(1);
		company.setCompanyName("Amazon");

		Employee employee1 = new Employee();
		employee1.setEmployeeId(101);
		employee1.setEmployeeName("Ravi");
		employee1.setEmployeeSalary(25000);

		Employee employee2 = new Employee();
		employee2.setEmployeeId(102);
		employee2.setEmployeeName("Jhon");
		employee2.setEmployeeSalary(35000);

//		// Adding the Employee object into Company obj 
//		List<Employee> eList = new ArrayList<Employee>();
//		eList.add(employee1);
//		eList.add(employee2);
//		company.setEmployee(eList);
		
		//Adding the Company into all the Employees
		employee1.setEmployee(company);
		employee2.setEmployee(company);

		Configuration conn = new Configuration();
		conn.configure();
		conn.addAnnotatedClass(Employee.class); // read the data from configaration file
		conn.addAnnotatedClass(Company.class);
		SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
		Session ss = sf.openSession(); // gives method to perform operations
		Transaction trn = ss.beginTransaction(); // act as a gateway
		
		ss.save(company);
		ss.save(employee1);
		ss.save(employee2);

		trn.commit();
		ss.close();
		sf.close();

	}
}
