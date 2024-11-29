package com.jsp.hibranate.HibernateProject_EmployeeDB;

import java.util.Scanner;

import com.jsp.hibernate.employeedb.dao.EmployeeDAO;

public class App {

	static Scanner scanner = new Scanner(System.in);
	static EmployeeDAO employee = new EmployeeDAO();

	public static void main(String[] args) {
		while (true) {
			System.out.println("1 . Add Employee");
			System.out.println("2 . Find Employee");
			System.out.println("3 . Update Employee");
			System.out.println("4 . Delete Employee");
			System.out.println("5 . EXIT");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				employee.addEmployee(scanner);
				break;

			case 2:
				employee.findEmployeeById(scanner);
				break;

			case 3:
				employee.updateEmployeeDescAndSalaryById(scanner);
				break;

			case 4:
				employee.deleteEmployeeById(scanner);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("Enter a valid chice!!");

			}
		}
	}
}
