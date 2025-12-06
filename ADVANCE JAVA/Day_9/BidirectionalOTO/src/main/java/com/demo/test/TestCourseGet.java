package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Course;
import com.demo.beans.Faculty;

public class TestCourseGet {

	public static void main(String[] args) {
		SessionFactory sFactory = new Configuration().configure().buildSessionFactory();
		Session session = sFactory.openSession();
		Transaction  transaction = session.beginTransaction();
		
		Course course = session.load(Course.class, 101);
		Faculty faculty = session.load(Faculty.class, 1);
		
		transaction.commit();
		
		System.out.println(course);
		System.out.println(faculty);

	}

}
