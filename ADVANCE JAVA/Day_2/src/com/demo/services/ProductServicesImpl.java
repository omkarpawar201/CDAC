package com.demo.services;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ProductServicesImpl implements ProductServices {
	ProductDao pdao = new ProductDaoImpl();

	@Override
	public boolean addNewProd() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Pid : ");
		int pid = sc.nextInt();
		System.out.print("Enter Pname : ");
		String pname = sc.next();
		System.out.print("Enter Quantity : ");
		int qty = sc.nextInt();
		System.out.print("Enter Price : ");
		double price = sc.nextDouble();
		System.out.print("Enter MFG Date (dd/mm/yyyy) : ");
		String date = sc.next();

		LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

		Product p = new Product(pid, pname, qty, price, ldt);
		return pdao.add(p);
	}

	@Override
	public List<Product> display() {
		return pdao.display();
	}

	@Override
	public boolean deleteProd(int id) {
		return pdao.deleteProd(id);
	}

	@Override
	public boolean updatePro(int id, int qty, double price) {
		return pdao.updatePro(id, qty, price);
	}

	@Override
	public Product findProd(int id) {
		return pdao.findProd(id);
	}

	@Override
	public List<Product> sortByPrice() {
		return pdao.sortByPrice();
	}
}
