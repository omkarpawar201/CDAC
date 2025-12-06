package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Cart;
import com.demo.beans.Product;

public class TestProductGet {

	public static void main(String[] args) {
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Product product = session.get(Product.class, 6);
		Cart cart = session.get(Cart.class, 1);
		
		System.out.println(product);
		System.out.println(cart);
		
		transaction.commit();
		session.close();
		sFactory.close();

	}

}
