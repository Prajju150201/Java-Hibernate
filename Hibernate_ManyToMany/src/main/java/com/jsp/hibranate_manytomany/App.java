package com.jsp.hibranate_manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration conn = new Configuration();
		conn.configure();
		conn.addAnnotatedClass(Student.class); // read the data from configaration file
		conn.addAnnotatedClass(Course.class);
		SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
		Session ss = sf.openSession(); // gives method to perform operations
		Transaction trn = ss.beginTransaction(); // act as a gateway
		
		
		Student student1 =new Student();
		student1.setStudentId(101);
		student1.setStudentName("Yogeesh");
		
		
		Student student2 =new Student();
		student2.setStudentId(102);
		student2.setStudentName("Deepti");
		
		
		Course course1 = new Course();
		course1.setCourseId(1);
		course1.setCourseName("Java");
		course1.setCourseFee(10000);
		
		

		Course course2 = new Course();
		course2.setCourseId(2);
		course2.setCourseName("HTML");
		course2.setCourseFee(5000);
		
		//Adding the Course into Students
		List<Course> cList = new ArrayList<Course>();
		cList.add(course1);
		cList.add(course2);
		student1.setCourses(cList);
		student2.setCourses(cList);
		
		
		
		//Adding the Students into Courses
		List<Student> eList = new ArrayList<Student>();
		eList.add(student1);
		eList.add(student2);
		course1.setStudents(eList);
		course2.setStudents(eList);
		
		
		
		ss.save(student1);
		ss.save(student2);
		ss.save(course1);
		ss.save(course2);

		trn.commit();
		ss.close();
		sf.close();
    	
    	
    	
    }
}
