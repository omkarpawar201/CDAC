package com.demo.services;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	ProductDao pDao = new ProductDaoImpl();

	@Override
	public boolean addNewProduct() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("enter Pid : ");
		int pid = scanner.nextInt();
		System.out.print("enter Pname : ");
		String pname = scanner.next();
		System.out.print("enter Qty : ");
		int qty = scanner.nextInt();
		System.out.print("enter Price : ");
		double price = scanner.nextDouble();

		Product product = new Product(pid, pname, qty, price);
		
		return pDao.addNewProduct(product);
	}

	@Override
	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return pDao.deleteProduct(pid);
	}

	@Override
	public Product searchProduct(int pid) {
		// TODO Auto-generated method stub
		return pDao.searchProduct(pid);
	}

	@Override
	public List<Product> displayProduct() {
		// TODO Auto-generated method stub
		return pDao.displayProduct();
	}

	@Override
	public boolean updateProduct(int pid, int qty, double price) {
		// TODO Auto-generated method stub
		return pDao.updateProduct(pid, qty, price);
	}

}
