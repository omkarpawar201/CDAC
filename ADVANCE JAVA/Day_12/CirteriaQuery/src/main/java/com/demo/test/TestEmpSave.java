package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestEmpSave {

	public static void main(String[] args) {
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee1 = new Employee("abc", 25000, "UI", 25);
		Employee employee2 = new Employee("def", 30000, "UX", 35);
		
		session.save(employee1);
		session.save(employee2);
		
		transaction.commit();
		session.close();
		sFactory.close();

	}

}
