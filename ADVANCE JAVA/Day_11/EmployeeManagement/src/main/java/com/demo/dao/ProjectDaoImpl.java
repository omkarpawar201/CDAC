package com.demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Project;

public class ProjectDaoImpl implements ProjectDao {
	static private SessionFactory sFactory = null;

	static {
		sFactory = HBUtil.getConnection();
	}

	@Override
	public boolean addNewProject(Project project) {
		Session session = sFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(project);

		transaction.commit();
		session.close();
		return true;
	}

}
