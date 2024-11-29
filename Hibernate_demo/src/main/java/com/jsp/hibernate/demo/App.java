package com.jsp.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Bike bike = new Bike();
    	bike.setBikeId(101);
    	bike.setBikeModel("Ninja 350");
    	bike.setBikeBrand("Kawasaki");
    	bike.setBikePrice(350000);
    	
    	Bike bike2 = new Bike();
    	bike2.setBikeId(102);
    	bike2.setBikeModel("RX 100");
    	bike2.setBikeBrand("Yamaha");
    	bike2.setBikePrice(150000);
    	
    	
    	
    	
        Configuration conn = new Configuration();
        conn.configure();
        conn.addAnnotatedClass(Bike.class); //read the data from configaration file 
        SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
        Session ss =sf.openSession(); //gives method to perform operations
        Transaction trn = ss.beginTransaction(); // act as a gateway
        
        
        ss.save(bike);
        ss.save(bike2);
        
        trn.commit();
        ss.close();
        sf.close();
        
        
    }
}
