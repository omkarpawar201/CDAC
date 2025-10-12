package com.demo.dao;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
    static Set<Student> stset;

    static {
        stset = new HashSet<>();
        // int sid, String sname, int m1, int m2, LocalDate dob
        stset.add(new Student(1, "Omkar", 50, 60, LocalDate.of(1999, 06, 16)));
        stset.add(new Student(2, "Pratik", 35, 45, LocalDate.of(1995, 12, 15)));
        stset.add(new Student(3, "Disha", 90, 85, LocalDate.of(2003, 11, 20)));
    }

    @Override
    public Set<Student> display() {
        return stset;
    }

    @Override
    public boolean addData(Student s) {
        return stset.add(s);

    }

    @Override
    public Student findById(int sid) {

        for (Student s : stset) {
            if (s.getSid() == sid) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Set<Student> findByName(String name) {
        Set<Student> s = new HashSet<>();
        for (Student st : stset) {
            if (st.getSname().equals(name)) {
                s.add(st);
            }
        }
        return s;

    }

    @Override
    public boolean changeMarks1(int sid, int m1) {

        Student s = findById(sid);

        if (s != null) {
            s.setM1(m1);
            return true;
        }
        return false;

    }

    @Override
    public boolean changeMarks2(int sid, int m2) {
        Student s = findById(sid);

        if (s != null) {
            s.setM2(m2);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeById(int sid) {
        return stset.remove(new Student(sid));
    }

    @Override
    public boolean removeByAvg(float avg) {

        return stset.removeIf(e -> (e.getM1() + e.getM2()) / 2.0f < avg);

    }

}
