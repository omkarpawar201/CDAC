package com.demo.services;

import com.demo.beans.User;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService{
	LoginDao lDao = new LoginDaoImpl();
	
	@Override
	public User validateUser(String uname, String pass) {
		// TODO Auto-generated method stub
		return lDao.validateUser(uname, pass);
	}

	@Override
	public boolean registerUser(String name, String role, String uname, String pass) {
		// TODO Auto-generated method stub
		return lDao.registerUser(name, role, uname, pass);
	}

}
