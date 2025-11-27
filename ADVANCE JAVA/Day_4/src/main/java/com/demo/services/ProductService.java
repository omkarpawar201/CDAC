package com.demo.services;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProduct();

	void deleteProduct(int pid);

	void addNewProduct(Product p);

	Product findProduct(int pid);

}
