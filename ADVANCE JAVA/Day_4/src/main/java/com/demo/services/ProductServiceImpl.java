package com.demo.services;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
	ProductDao pDao = new ProductDaoImpl();

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pDao.getAllProduct();
	}

	@Override
	public void deleteProduct(int pid) {
		pDao.deleteProduct(pid);
		
	}

	@Override
	public void addNewProduct(Product p) {
		pDao.addNewProduct(p);
		
	}

	@Override
	public Product findProduct(int pid) {
		// TODO Auto-generated method stub
		return pDao.findProduct(pid);
	}

}
