package com.jsp.hibernate.demo.car;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Car_Fetch {
	public static void main(String[] args) {

        Configuration conn = new Configuration();
        conn.configure();
        conn.addAnnotatedClass(Car.class); //read the data from configaration file 
        SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
        Session ss =sf.openSession(); //gives method to perform operations
        Transaction trn = ss.beginTransaction(); // act as a gateway
        
        
        //Return null if the primary key doesn't exists
        //get() is Eager Loader -> Query is fired if the object is not used.
        
        Car car =ss.get(Car.class, 101);
        System.out.println(car);
        
        //Throws the Exception if the primary doesn't exists
        //load() is lazy Loaded-> Query is not fired if the object is not used in the code
        Car car2 =ss.load(Car.class, 102);
        System.out.println(car2);
        
        trn.commit();
        ss.close();
        sf.close();
		
	}

}
