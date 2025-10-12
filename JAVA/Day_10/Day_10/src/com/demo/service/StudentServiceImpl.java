package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

    StudentDao sdao = new StudentDaoImpl();

    @Override
    public Set<Student> displayAll() {
        return sdao.display();

    }

    @Override
    public boolean addNewStudent() {
        // int sid, String sname, int m1, int m2, LocalDate dob
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID : ");
        int id = sc.nextInt();
        System.out.print("Enter Name : ");
        String name = sc.next();
        System.out.print("Enter M1 : ");
        int m1 = sc.nextInt();
        System.out.print("Enter M2 : ");
        int m2 = sc.nextInt();
        System.out.print("Enter DOB (dd/MM/yyyy) : ");
        String date = sc.next();

        LocalDate ldt = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Student s = new Student(id, name, m1, m2, ldt);
        sc.close();
        return sdao.addData(s);

    }

    @Override
    public Student findById(int sid) {
        return sdao.findById(sid);
    }

    @Override
    public Set<Student> findByName(String name) {
        return sdao.findByName(name);
    }

    @Override
    public boolean UpdateMark1(int m1, int m12) {
        return sdao.changeMarks1(m1, m12);
    }

    @Override
    public boolean UpdateMark2(int sid, int m2) {
        return sdao.changeMarks2(sid, m2);
    }

    @Override
    public boolean deleteById(int sid) {
        return sdao.removeById(sid);
    }

    @Override
    public boolean deleteByAvg(float avg) {
       return sdao.removeByAvg(avg);
    }

}
