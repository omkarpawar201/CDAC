package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");

		out.println("<form action='demo2' method='get'>");
		out.println("Location : <input type='text' name='location' id='location'/><br/>");
		out.println("<input type='hidden' name='name' id='nm' value='" + name + "'/><br/>");
		out.println(" <Button type='submit' name='btn' id='btn'>submit data</button><br/>");

		out.println("</form>");
	}
}
