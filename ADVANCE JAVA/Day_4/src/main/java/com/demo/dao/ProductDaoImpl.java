package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {

	static Connection conn = null;
	static PreparedStatement getProduct, deleteProduct, addProduct, findProduct;

	static {
		try {
			conn = DBUtil.getConnection();
			getProduct = conn.prepareStatement("select * from product1");
			deleteProduct = conn.prepareStatement("delete from product1 where pid=?");
			addProduct = conn.prepareStatement("insert into product1 values(?,?,?,?,?,?)");
			findProduct = conn.prepareStatement("select * from product1 where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> lst = new ArrayList<>();

		try {
			ResultSet rs = getProduct.executeQuery();

			while (rs.next()) {
				Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4),
						rs.getDate(5).toLocalDate(), rs.getInt(6));
				lst.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lst;
	}

	@Override
	public void deleteProduct(int pid) {
		try {
			deleteProduct.setInt(1, pid);
			deleteProduct.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void addNewProduct(Product p) {
		try {
			addProduct.setInt(1, p.getPid());
			addProduct.setString(2, p.getPname());
			addProduct.setInt(3, p.getQty());
			addProduct.setDouble(4, p.getPrice());
			addProduct.setDate(5, java.sql.Date.valueOf(p.getExpdate()));
			addProduct.setInt(6, p.getCid());
			
			addProduct.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public Product findProduct(int pid) {
		Product p = null;
		try {
			findProduct.setInt(1, pid);
			ResultSet rs = findProduct.executeQuery();
			
			while (rs.next()) {
				p = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4),rs.getDate(5).toLocalDate(),rs.getInt(6));
				return p;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}

}
