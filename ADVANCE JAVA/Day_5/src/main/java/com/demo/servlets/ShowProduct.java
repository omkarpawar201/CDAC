	package com.demo.servlets;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Product;
import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

public class ShowProduct extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		ProductService pService = new ProductServiceImpl();
		List<Product> lst = pService.getAllProduct();

		out.println(
				"<table border='2'><tr><th>Id</th><th>Name</th><th>qty</th><th>price</th><th>expdate</th><th>cid</th><th>action</th></tr>");

		for (Product p : lst) {
			out.println("<tr><td>" + p.getPid() + "</td><td>" + p.getPname() + "</td><td>" + p.getQty() + "</td><td>"
					+ p.getPrice() + "</td><td>" + p.getExpdate() + "</td><td>" + p.getCid() + "</td>");
			out.println("<td><a href='deleteproduct?pid=" + p.getPid() + "'>delete</a>/<a href='editproduct?pid="
					+ p.getPid() + "'>edit</a></td></tr>");
		}
		out.println("</table>");
		out.println("<a href='AddProduct.html'>Add new product</a>");

	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		doPost(req, resp);
	}
}
