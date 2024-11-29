package com.jsp.hibernate.shopping_cart.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.shopping_cart.entity.Cart;
import com.jsp.hibernate.shopping_cart.entity.Product;
import com.jsp.hibernate.shopping_cart.entity.User;

public class ShoppingCartDao {
	
	

	
	
	public static Session getSession() {
		
		

		Configuration conn = new Configuration();
		conn.configure();
		conn.addAnnotatedClass(User.class); 
		conn.addAnnotatedClass(Cart.class);
		conn.addAnnotatedClass(Product.class);
		SessionFactory sf = conn.buildSessionFactory(); 
		Session ss = sf.openSession(); 
		return ss;
		
	}
	
	public void addProduct() {
		Scanner sc = new Scanner(System.in);
		Session session = getSession();
		Transaction transaction =session.beginTransaction();
		
		
		Product product = new Product();
			
		
				System.out.println("Enter the Product Id: ");
				product.setProductId(sc.nextInt());
				System.out.println("Enter the Product Name: ");
				product.setProductName(sc.next());
				System.out.println("Enter the Product Brand: ");
				product.setProductBrand(sc.next());
				System.out.println("Enter the Product Price: ");
				product.setProductPrice(sc.nextInt());
				
				session.save(product);
				
				transaction.commit();
				session.close();
		
	}

	
	public void addUserWithCart() {
		
		Scanner sc = new Scanner(System.in);
		

		User user = new User();
		
		System.out.println("Enter the user Id: ");
		user.setUserId(sc.nextInt());
		System.out.println("Enter the user Name: ");
		user.setUserName(sc.next());
		System.out.println("Enter the user Email: ");
		user.setUserEmail(sc.next());
		System.out.println("Enter the user Age: ");
		user.setUserAge(sc.nextInt());
		System.err.println("Enter the user City ");
		user.setUserCity(sc.next());
		
		Cart cart = new Cart();
		System.out.println("Enter the Cart Id: ");
		
		Session session = getSession();
		Transaction transaction =session.beginTransaction();
		car
		
		
		
	}
	
	public void addProductToCart() {
		
		Scanner sc = new Scanner(System.in);
		Session session = getSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("Enter Product Id: ");
		
		Product existingProduct  = session.get(Product.class,  sc.nextInt());
		if (existingProduct != null) {
			System.out.println("Enter User Id: ");
			
			User existingUser = session.get(User.class, sc.nextInt());
			if (existingUser != null) {
				
				Cart cart = existingUser.getCart();
				List<Product> pList = cart.getProduct();
				session.update(cart);
			}else {
				System.err.println("User Not Found!!");
			}
			
		}else {
			System.out.println("Product Not Found!");
			
		}
		
		tran.commit();
		session.close();
		
		
			
		}
		
	
	
	public void removeProductFromCart() {
		Scanner sc = new Scanner(System.in);
		Session session = getSession();
		Transaction transaction =session.beginTransaction();
		
		
		
		
	}
	
	public void findAllProductFromCart() {
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
