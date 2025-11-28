package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.beans.User;
import com.demo.services.LoginService;
import com.demo.services.LoginServiceImpl;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		LoginService lService = new LoginServiceImpl();
		
		User user = lService.validateUser(uname, pass);
		
		if(user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			
			RequestDispatcher rd = req.getRequestDispatcher("category");
			rd.forward(req, res);
		}
		else {
			out.println("<h2 style=\"color: red; font-style: italic;\">Invalid Credintials</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
	}
}
