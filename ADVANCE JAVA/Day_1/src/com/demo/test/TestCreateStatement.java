package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class TestCreateStatement {

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

			Statement st = conn.createStatement();
			ResultSet rst = st.executeQuery("Select * from dept");

			while (rst.next()) {
				System.out.println("deptno : " + rst.getInt(1));
				System.out.println("dname : " + rst.getString(2));
				System.out.println("loc : " + rst.getString(3));
				System.out.println("date : " + rst.getString(4));
				System.out.println("pwd : " + rst.getString(5));
				System.out.println("<--------------------------->");
			}

			int deptno = 70;
			String dname = "DEF";
			String loc = "Mumbai";
//			LocalDate ldt = LocalDate.now();
//			String date = ldt.toString();
			String date = "12/05/1998";
			String pwd = "def@123";

			String query = "insert into dept values (" + deptno + ",'" + dname + "','" + loc + "','" + pwd + "','"
					+ date + "')";

			System.out.println(query);
			int n = st.executeUpdate(query);
			if (n > 0) {
				System.out.println("Insertion done");
			} else {
				System.out.println("Error");
			}

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
