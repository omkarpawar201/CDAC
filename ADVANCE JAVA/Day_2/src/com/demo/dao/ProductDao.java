package com.demo.dao;

import com.demo.beans.Product;

import java.util.List;

public interface ProductDao {
	boolean add(Product p);

	List<Product> display();

	boolean deleteProd(int id);

	boolean updatePro(int id, int qty, double price);

	Product findProd(int id);

	List<Product> sortByPrice();
}
