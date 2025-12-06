package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee3")
public class Employee {
	@Id
	@GeneratedValue
	private int empid;
	private String name;
	private double sal;
	private String dept;
	private int age;

	public Employee() {
		super();
	}

	public Employee(String name, double sal, String dept, int age) {
		super();
		this.name = name;
		this.sal = sal;
		this.dept = dept;
		this.age = age;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", sal=" + sal + ", dept=" + dept + ", age=" + age + "]";
	}

}
