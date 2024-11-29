package com.jsp.hibranate.Hibernate_OneToOne;

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

    	  Configuration conn = new Configuration();
          conn.configure();
          conn.addAnnotatedClass(Person.class); //read the data from configaration file 
          conn.addAnnotatedClass(Aadhar.class);
          SessionFactory sf = conn.buildSessionFactory(); // Build the connetion and Create
          Session ss =sf.openSession(); //gives method to perform operations
          Transaction trn = ss.beginTransaction(); // act as a gateway
    
          
          Person person = new Person();
          person.setPersonId(101);
          person.setPersonName("Prajwal");
          
          Aadhar aadhar = new Aadhar();
          aadhar.setAadharId(1);
          aadhar.setAadharNo(855841441);
          
          //Adding   the Adhar obj into Person obj
          
          person.setAadhar(aadhar);
          

          ss.save(person);
          ss.save(aadhar);
          
          trn.commit();
          ss.close();
          sf.close();
    
    }
}
