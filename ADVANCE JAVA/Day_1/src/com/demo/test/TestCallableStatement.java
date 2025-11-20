package com.demo.test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestCallableStatement {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.117:3306/dac45?useSSL=false";

			conn = DriverManager.getConnection(url, "dac45", "welcome");

			if (conn != null) {
				System.out.println("Connection succesfull");
			} else {
				System.out.println("Connection unsuccesfull");
			}

			CallableStatement cst = conn.prepareCall("call getcnt(?,?)");

			cst.setInt(1, 10);
			cst.registerOutParameter(2, java.sql.Types.INTEGER);
			cst.execute();
			int cnt = cst.getInt(2);
			System.out.println("count : " + cnt);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
