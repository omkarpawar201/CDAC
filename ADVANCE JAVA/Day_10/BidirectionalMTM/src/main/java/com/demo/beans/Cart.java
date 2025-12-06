package com.demo.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
	private int cid;
	private double total_Price;
	@ManyToMany
	List<Product> pList;

	public Cart() {
		super();
	}

	public Cart(int cid, List<Product> pList) {
		super();
		this.cid = cid;
		this.pList = pList;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public double getTotal_Price() {
		return total_Price;
	}

	public void setTotal_Price(double total_Price) {
		this.total_Price = total_Price;
	}

	public List<Product> getpList() {
		return pList;
	}

	public void setpList(List<Product> pList) {
		this.pList = pList;
	}

	@Override
	public String toString() {
		return "Cart [cid=" + cid + ", pList=" + pList + "]";
	}

}
