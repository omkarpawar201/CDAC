package com.demo.service;

import java.util.Set;

import com.demo.beans.Student;

public interface StudentService {

    Set<Student> displayAll();

    boolean addNewStudent();

    Student findById(int sid);

    Set<Student> findByName(String name);

    boolean UpdateMark1(int m1, int m12);

    boolean UpdateMark2(int sid, int m2);

    boolean deleteById(int sid);

    boolean deleteByAvg(float avg);

}
