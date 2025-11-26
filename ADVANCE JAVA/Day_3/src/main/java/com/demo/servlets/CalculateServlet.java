package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculateServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		String btn = req.getParameter("btn");

		switch (btn) {
		case "add" -> {
			int ans = num1 + num2;
			out.println("<h2>Addition : " + ans + "</h2>");
		}
		case "mul" -> {
			int ans = num1 * num2;
			out.println("<h2>Multiplication : " + ans + "</h2>");
		}
		case "fact" -> {
			int ans = factorial(num1);
			out.println("<h2>Multiplication : " + ans + "</h2>");
		}
		}
	}

	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
