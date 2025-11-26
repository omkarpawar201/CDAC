package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao {

	static Connection conn = null;
	static PreparedStatement getUser, registerUser;

	static {
		try {
			conn = DBUtil.getConnection();
			getUser = conn.prepareStatement("select user, email, role from user where user=? and password=?");
			registerUser = conn.prepareStatement("insert into user values(?,?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public User validateUser(String uname, String pass) {
		try {
			getUser.setString(1, uname);
			getUser.setString(2, pass);

			ResultSet rst = getUser.executeQuery();

			while (rst.next()) {
				User user = new User(rst.getString(1), rst.getString(2), rst.getString(3));
				return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean registerUser(String name, String role, String uname, String pass) {

		try {
			registerUser.setString(1, uname);
			registerUser.setString(2, pass);
			registerUser.setString(3, role);
			registerUser.setString(4, name);

			int n = registerUser.executeUpdate();

			return n > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
