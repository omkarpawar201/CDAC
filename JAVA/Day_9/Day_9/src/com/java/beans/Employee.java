package com.java.beans;

import java.time.LocalDate;

public class Employee {
    private int empid;
    private String ename;
    private double sal;
    private LocalDate jdt;

    public Employee() {
        super();
    }

    public Employee(int empid, String ename, double sal, LocalDate jdt) {
        super();
        this.empid = empid;
        this.ename = ename;
        this.sal = sal;
        this.jdt = jdt;
    }

    public Employee(int id2) {
        super();
        this.empid = id2;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public LocalDate getJdt() {
        return jdt;
    }

    public void setJdt(LocalDate jdt) {
        this.jdt = jdt;
    }

    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", jdt=" + jdt + "]";
    }

}
