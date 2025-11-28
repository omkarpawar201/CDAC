package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getAllProduct();

	void deleteProduct(int pid);

	void addNewProduct(Product p);

	Product findProduct(int pid);

	List<Integer> getAllCategory();

}
