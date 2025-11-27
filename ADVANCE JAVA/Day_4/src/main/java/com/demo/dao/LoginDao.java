package com.demo.dao;

import com.demo.beans.User;

public interface LoginDao {

	User validateUser(String uname, String pass);

	boolean registerUser(String name, String role, String uname, String pass);

}
