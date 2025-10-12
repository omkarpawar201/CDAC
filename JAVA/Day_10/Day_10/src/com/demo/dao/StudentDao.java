package com.demo.dao;

import java.util.Set;

import com.demo.beans.Student;

public interface StudentDao {

    Set<Student> display();

    boolean addData(Student s);

    Student findById(int sid);

    Set<Student> findByName(String name);

    boolean changeMarks1(int sid, int m1);

    boolean changeMarks2(int sid, int m2);

    boolean removeById(int sid);

    boolean removeByAvg(float avg);

}
