package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		response.setContentType("text/html");

		String name = request.getParameter("name");
		String val = request.getParameter("val");
		String btn = request.getParameter("btn");

		PrintWriter out = response.getWriter();

		switch (btn) {
		case "add" -> {
			Cookie cookie = new Cookie(name, val);
			response.addCookie(cookie);
			out.println("<h1>Cookie Added</h1>");
		}
		case "delete"->{
			Cookie[] carr=request.getCookies();
			for(Cookie c :carr) {
				if(c.getName().equals(name)) {
					//delete the cookie
					c.setMaxAge(0);
					response.addCookie(c);
					out.println("<h3>Cookie deleted "+name+"</h3>");
					break;
					
				}
			}
		}
		case "display"->{
			Cookie[] carr=request.getCookies();
			for(Cookie c :carr) {
				out.println("name : "+c.getName()+"---->"+"Value : "+c.getValue());
			}
		}
		}
		RequestDispatcher rd= request.getRequestDispatcher("CookieDemo.html");
		rd.include(request, response);
		}
}
