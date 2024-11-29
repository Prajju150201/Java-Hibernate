package com.jsp.hibernate.demo.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Car_Delete {
	public static void main(String[] args) {
		

	 Configuration conn = new Configuration();
    conn.configure();
    conn.addAnnotatedClass(Car.class); //read the data from configaration file 
    SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
    Session ss =sf.openSession(); //gives method to perform operations
    Transaction trn = ss.beginTransaction(); // act as a gateway
    
    
    
    //fetching the data from the DB
    Car car =ss.get(Car.class, 101);
    
    
    //Deleting the data
    ss.delete(car);
    
    trn.commit();
    ss.close();
    sf.close();
		
    
	}
}
