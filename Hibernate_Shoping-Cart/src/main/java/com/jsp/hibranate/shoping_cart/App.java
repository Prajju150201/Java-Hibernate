package com.jsp.hibranate.shoping_cart;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.shopping_cart.entity.Cart;
import com.jsp.hibernate.shopping_cart.entity.Product;
import com.jsp.hibernate.shopping_cart.entity.User;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
    	Configuration conn = new Configuration();
		conn.configure();
		conn.addAnnotatedClass(User.class); 
		conn.addAnnotatedClass(Cart.class);
		conn.addAnnotatedClass(Product.class);
		SessionFactory sf = conn.buildSessionFactory(); 
		Session ss = sf.openSession(); 
		Transaction trn = ss.beginTransaction(); 
		
		
		trn.commit();
		ss.close();
		sf.close();
    	
    	
    	
    }
}
