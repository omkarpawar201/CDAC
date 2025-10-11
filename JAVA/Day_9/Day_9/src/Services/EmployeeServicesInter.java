package Services;

import java.util.List;

import com.java.beans.Employee;

public interface EmployeeServicesInter {
    int id = 0;

    boolean addNewEmp();

    List<Employee> displayAll();

    Employee searchById(int id2);

    Employee searchByName(String nam);

    boolean updateSal(int id2, double sal);

    boolean deletedById(int id2);

    boolean deletedBySal(double sal);

    List<Employee> sortByName();

    List<Employee> sortBySal();

     
}
