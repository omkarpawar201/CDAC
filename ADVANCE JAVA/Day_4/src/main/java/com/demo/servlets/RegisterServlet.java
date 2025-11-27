package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.User;
import com.demo.services.LoginService;
import com.demo.services.LoginServiceImpl;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String role = req.getParameter("role");
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		LoginService lService = new LoginServiceImpl();
		
		boolean status = lService.registerUser(name, role, uname, pass);
		
		if (status) {
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.forward(req, res);
		}
		else {
			out.println("<h1>Not Added</h1>");
		}
	}
}
