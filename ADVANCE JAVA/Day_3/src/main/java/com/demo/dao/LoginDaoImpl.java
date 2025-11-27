package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.beans.User;

public class LoginDaoImpl implements LoginDao {

	static Connection conn = null;
	static PreparedStatement getUser;

	static {
		try {
			conn = DBUtil.getConnection();
			getUser = conn.prepareStatement("select user, email, role from user where user=? and password=?");
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

}
