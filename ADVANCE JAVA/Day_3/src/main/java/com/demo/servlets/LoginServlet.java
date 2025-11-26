package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.User;
import com.demo.services.LoginService;
import com.demo.services.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		LoginService lService = new LoginServiceImpl();
		
		User user = lService.validateUser(uname, pass);
		
		if(user != null) out.print("<h1>Valid User</h1>");
		else out.print("<h1>Invalid User</h1>");
	}
}
