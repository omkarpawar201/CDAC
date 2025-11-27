package com.demo.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.services.ProductService;
import com.demo.services.ProductServiceImpl;

public class DeleteProduct extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		int pid = Integer.parseInt(req.getParameter("pid"));
		ProductService pService = new ProductServiceImpl();
		
		pService.deleteProduct(pid);
		RequestDispatcher rd = req.getRequestDispatcher("showproduct");
		rd.forward(req, resp);
	}
}
