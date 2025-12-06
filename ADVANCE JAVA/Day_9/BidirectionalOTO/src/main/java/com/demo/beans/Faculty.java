package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	@Id
	private int fid;
	private String fname;
	@OneToOne(fetch = FetchType.LAZY)
	private Course course;

	public Faculty() {
		super();
	}

	public Faculty(int fid, String fname, Course course) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.course = course;
	}
	
	public Faculty(int fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", course=" + course + "]";
	}

}
