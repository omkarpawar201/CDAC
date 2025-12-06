package com.demo.test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Department;
import com.demo.beans.Employee;

public abstract class TestEmployeeSave {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		Department dpt1 = new Department(1,"Tpo","Pune");
		Department dpt2 = new Department(2,"UI","Mumbai");
		
		Employee e1 = new Employee(1,"Omkar",LocalDate.of(2025, 12, 02),25000,dpt1);
		Employee e2 = new Employee(2,"Abhishek",LocalDate.of(2025, 12, 02),25000,dpt1);
		Employee e3 = new Employee(3,"Disha",LocalDate.of(2024, 12, 02),250000,dpt2);
		Employee e4 = new Employee(4,"Niyati",LocalDate.of(2025, 12, 02),25000,dpt2);
		Employee e5 = new Employee(5,"Pratik",LocalDate.of(2025, 12, 02),25000,dpt2);
		
		Set<Employee> set1 = new HashSet<>();
		set1.add(e1);
		set1.add(e2);
		
		Set<Employee> set2 = new HashSet<>();
		set2.add(e3);
		set2.add(e4);
		set2.add(e5);
		
		dpt1.setEmployees(set1);
		dpt2.setEmployees(set2);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		session.save(e4);
		session.save(e5);
		session.save(dpt1);
		session.save(dpt2);
		
		tr.commit();
		session.close();
		sf.close();
	}

}
