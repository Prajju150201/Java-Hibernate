package com.jsp.hibernate.demo.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Car_Update {
	
public static void main(String[] args) {
	
	 Configuration conn = new Configuration();
     conn.configure();
     conn.addAnnotatedClass(Car.class); //read the data from configaration file 
     SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
     Session ss =sf.openSession(); //gives method to perform operations
     Transaction trn = ss.beginTransaction(); // act as a gateway
     
     
     Car car2 =ss.get(Car.class, 102);
     System.out.println(car2);
     
    
		car2.setCarName("Safari");
		
     
     ss.update(car2);
     
     trn.commit();
     ss.close();
     sf.close();
		
	
}

}
