package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HBUtil {
	static SessionFactory sFactory = null;

	public static SessionFactory getConnection() {
		if (sFactory == null) {
			sFactory = new Configuration().configure().buildSessionFactory();
		}
		return sFactory;
	}

	public static void closeConnection() {
		sFactory.close();
	}
}
