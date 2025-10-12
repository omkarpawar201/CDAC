package com.demo.test;

import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImpl;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        StudentService stser = new StudentServiceImpl();

        do {
            System.out.println("1. Add new Student\n2. Display all\n3. Search by id");
            System.out.println(
                    "4. Search by name\n5. Update Marks\n6. Delete by ID\n7. Delete by Average Marks");
            System.out.println("8. Sort by Marks1\n9. Sort By name\n10. Sort By id\n11. exit");
            System.out.print("Enter your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    boolean status = stser.addNewStudent();
                    if (status) {
                        System.out.println("Added Successfully");
                    } else {
                        System.out.println("Not Added!!");
                    }
                }

                case 2 -> {
                    Set<Student> s = stser.displayAll();

                    for (Student st : s) {
                        System.out.println(st);
                    }

                }

                case 3 -> {
                    System.out.print("Enter ID : ");
                    int sid = sc.nextInt();
                    Student s = stser.findById(sid);

                    if (s != null) {
                        System.out.println(s);
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 4 -> {
                    System.out.print("Enter Name : ");
                    String name = sc.next();

                    Set<Student> s = stser.findByName(name);

                    if (s.size() > 0) {
                        s.forEach(System.out::println);
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 5 -> {
                    System.out.print("Enter ID : ");
                    int sid = sc.nextInt();
                    System.out.println("Enter Choice \n1. Marks1 \n2. Marks2\nchoice:");
                    int c = sc.nextInt();

                    switch (c) {
                        case 1 -> {
                            System.out.print("Enter Marks 1 : ");
                            int m1 = sc.nextInt();
                            boolean status = stser.UpdateMark1(sid, m1);

                            if (status) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Invalid");
                            }
                        }
                        case 2 -> {
                            System.out.print("Enter Marks 2 : ");
                            int m2 = sc.nextInt();
                            boolean status = stser.UpdateMark2(sid, m2);

                            if (status) {
                                System.out.println("Updated Successfully");
                            } else {
                                System.out.println("Invalid");
                            }
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Enter ID : ");
                    int sid = sc.nextInt();

                    boolean status = stser.deleteById(sid);

                    if (status) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 7 -> {
                    System.out.print("Enter Average Marks : ");
                    float avg = sc.nextFloat();

                    boolean status = stser.deleteByAvg(avg);

                    if (status) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Not Found");
                    }
                }

                default -> {
                    System.out.println("Wrong Choice");
                }
            }

        } while (choice != 11);

        sc.close();

    }
}
