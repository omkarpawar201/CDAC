package com.demo.services;

import com.demo.beans.User;

public interface LoginService {

	User validateUser(String uname, String pass);

	boolean registerUser(String name, String role, String uname, String pass);

}
