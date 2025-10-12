package com.demo.beans;

import java.time.LocalDate;


public class Student {
    private int sid;
    private String sname;
    private int m1, m2;
    private LocalDate dob;

    public Student() {
    }

    public Student(int sid, String sname, int m1, int m2, LocalDate dob) {
        this.sid = sid;
        this.sname = sname;
        this.m1 = m1;
        this.m2 = m2;
        this.dob = dob;
    }

    public Student(int sid) {
        this.sid = sid;
    }

    @Override
    public int hashCode() {
        System.out.println("Hashcode");
        return sid;
    }

    @Override
    public boolean equals(Object obj) {

        System.out.println("In Equals method " + this.sid + "----" + ((Student) obj).sid);
        return this.sid == ((Student) obj).sid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student [sid=" + sid + ", sname=" + sname + ", m1=" + m1 + ", m2=" + m2 + ", dob=" + dob + "]";
    }

}
