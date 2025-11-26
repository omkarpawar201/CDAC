package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	static Connection conn = null;

	public static Connection getConnection() {

		if (conn == null) {
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url = "jdbc:mysql://192.168.10.117:3306/dac45?useSSL=false";
				conn = DriverManager.getConnection(url, "dac45", "welcome");

				if (conn != null)
					System.out.println("Connection Successful");
				else
					System.out.println("Connection Unsuccessful");
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		return conn;

	}

	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
