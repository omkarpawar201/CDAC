package com.demo.dao;

import com.demo.beans.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
	static Connection conn = null;
	static PreparedStatement insertProd, displayProd, deleteProd, updateProd, findProd, sortProd;

	static {
		conn = DBUtil.getMyConnection();
		try {
			insertProd = conn.prepareStatement("insert into myproduct values(?,?,?,?,?)");
			displayProd = conn.prepareStatement("select * from myproduct");
			deleteProd = conn.prepareStatement("delete from myproduct where pid=?");
			updateProd = conn.prepareStatement("update myproduct set qty=?, price=? where pid=?");
			findProd = conn.prepareStatement("select * from myproduct where pid=?");
			sortProd = conn.prepareStatement("select * from myproduct order by price desc");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean add(Product p) {
		try {
			insertProd.setInt(1, p.getPid());
			insertProd.setString(2, p.getPname());
			insertProd.setInt(3, p.getQty());
			insertProd.setDouble(4, p.getPrice());
			insertProd.setDate(5, java.sql.Date.valueOf(p.getLdt()));

			int n = insertProd.executeUpdate();

			return n > 0;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
//        return false;
	}

	@Override
	public List<Product> display() {
		List<Product> pst = new ArrayList<>();

		try {
			ResultSet rst = displayProd.executeQuery();

			while (rst.next()) {
				pst.add(new Product(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getDouble(4),
						rst.getDate(5).toLocalDate()));
			}

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		if (!pst.isEmpty())
			return pst;
		return null;
	}

	@Override
	public boolean deleteProd(int id) {
		try {
			deleteProd.setInt(1, id);
			int n = deleteProd.executeUpdate();

			if (n > 0)
				return true;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return false;
	}

	@Override
	public boolean updatePro(int id, int qty, double price) {
		try {
			updateProd.setInt(3, id);
			updateProd.setDouble(2, price);
			updateProd.setInt(1, qty);

			int n = updateProd.executeUpdate();
			return n > 0;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Product findProd(int id) {
		Product p = null;

		try {
			findProd.setInt(1, id);
			ResultSet rst = findProd.executeQuery();

			while (rst.next()) {
				p = new Product(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getDouble(4),
						rst.getDate(5).toLocalDate());
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return p;
	}

	@Override
	public List<Product> sortByPrice() {
		List<Product> pst = new ArrayList<>();

		try {
			ResultSet rst = sortProd.executeQuery();

			while (rst.next()) {
				pst.add(new Product(rst.getInt(1), rst.getString(2), rst.getInt(3), rst.getDouble(4),
						rst.getDate(5).toLocalDate()));
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		if (!pst.isEmpty())
			return pst;

		return null;
	}
}
