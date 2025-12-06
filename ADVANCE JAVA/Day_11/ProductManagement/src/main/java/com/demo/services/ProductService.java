package com.demo.services;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	boolean deleteProduct(int pid);

	Product searchProduct(int pid);

	List<Product> displayProduct();

	boolean updateProduct(int pid, int qty, double price);

}
