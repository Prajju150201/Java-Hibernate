package com.jsp.hibernate.demo.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Car_Insert {
	public static void main(String[] args) {
		Car car = new Car();
		car.setCarId(101);
		car.setCarName("Civic");
		car.setCarBrand("Honda");
		car.setCarPrice(270000);
		
		Car car2 = new Car();
		car2.setCarId(102);
		car2.setCarName("nano");
		car2.setCarBrand("TATA");
		car2.setCarPrice(130000);
		

        Configuration conn = new Configuration();
        conn.configure();
        conn.addAnnotatedClass(Car.class); //read the data from configaration file 
        SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
        Session ss =sf.openSession(); //gives method to perform operations
        Transaction trn = ss.beginTransaction(); // act as a gateway
        
        
        ss.save(car);
        ss.save(car2);
       
        
        trn.commit();
        ss.close();
        sf.close();
        
		
	}

}
