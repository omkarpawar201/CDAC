package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.MyUser;
import com.demo.beans.Product1;

public class TestUser {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		MyUser user1 = new MyUser(3, "xyz", "xyz@1213");
		MyUser user2 = new MyUser(4, "ghj", "ghj@1213");
		Product1 product1 = new Product1("a", 5, 5400);
		Product1 product2 = new Product1("b", 10, 400);
		
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(user1);
		session.save(user2);
		session.save(product1);
		session.save(product2);
		
		transaction.commit();
		session.close();
		sf.close();

	}

}
