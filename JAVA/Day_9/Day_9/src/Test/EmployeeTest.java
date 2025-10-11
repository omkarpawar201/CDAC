package Test;

import java.util.List;
import java.util.Scanner;

import com.java.beans.Employee;
import Services.EmployeeService;
import Services.EmployeeServicesInter;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeServicesInter eser = new EmployeeService();

        int choice = 0;
        do {
            System.out.println("\n1. Add new employee\n2. Display all\n3. Search by id");
            System.out.println("4. Search by name\n5. Update salary\n6. Delete by id\n7. Delete by salary");
            System.out.println("8. Search by salary \n9. Sort by salary\n10. Sort by name\n11. Exit");
            System.out.println("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean status = eser.addNewEmp();

                    if (status) {
                        System.out.println("Added Successfully");
                    } else {
                        System.out.println("Not Added!!");
                    }
                }
                case 2 -> {
                    List<Employee> e = eser.displayAll();

                    e.forEach(System.out::println);
                }

                case 3 -> {
                    System.out.println("Enter Id : ");
                    int id = sc.nextInt();
                    Employee e = eser.searchById(id);
                    if (e != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 4 -> {
                    System.out.println("Enter Name : ");
                    String nam = sc.next();
                    Employee e = eser.searchByName(nam);
                    if (e != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("Not Found");
                    }

                }

                case 5 -> {
                    System.out.println("Enter Id : ");
                    int id = sc.nextInt();
                    System.out.println("Enter Salary : ");
                    double sal = sc.nextDouble();

                    boolean status = eser.updateSal(id, sal);

                    if (status) {
                        System.out.println("Update Succesfully");
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 6 -> {
                    System.out.println("Enter Id : ");
                    int id = sc.nextInt();

                    boolean status = eser.deletedById(id);

                    if (status) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 7 -> {
                    System.out.println("Enter Salary : ");
                    double sal = sc.nextDouble();

                    boolean status = eser.deletedBySal(sal);

                    if (status) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 8 -> {
                    System.out.println("Enter Salary : ");
                    double sal = sc.nextDouble();

                    boolean status = eser.deletedBySal(sal);

                    if (status) {
                        System.out.println("Deleted Successfully");
                    } else {
                        System.out.println("Not Found");
                    }
                }

                case 9 -> {
                    List<Employee> lst = eser.sortBySal();

                    lst.forEach(System.out::println);
                }

                case 10 -> {
                    List<Employee> lst = eser.sortByName();

                    lst.forEach(System.out::println);
                }

                default -> {
                    System.out.println("Wrong Choice...");
                }
            }

        } while (choice != 11);

        sc.close();
    }
}
