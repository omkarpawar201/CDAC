package com.demo.beans;

import java.util.Date;

public class Friends {
	//id,name,lastname,hobbies,mobno,email,bdate,address
	private int id = 0;
	private String fname;
	private String lname;
	private int mobno;
	private String email;
	private Date bDate;
	private String address;
	static int idcnt;
	
	static {
		idcnt = 0;
	}
	
	public Friends() {
		super();
	}
	public Friends(String fname, String lname, int mobno, String email, Date bDate, String address) {
		super();
		idcnt++;
		this.id = idcnt;
		this.fname = fname;
		this.lname = lname;
		this.mobno = mobno;
		this.email = email;
		this.bDate = bDate;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getbDate() {
		return bDate;
	}
	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Friends [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobno=" + mobno + ", email=" + email
				+ ", bDate=" + bDate + ", address=" + address + "]";
	}
	
}
