package Services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.java.beans.Employee;
import Dao.EmployeeDao;
import Dao.EmployeeDaoInter;

public class EmployeeService implements EmployeeServicesInter {

    private EmployeeDao edao;

    public EmployeeService() {
        edao = new EmployeeDao();
    }

    @Override
    public boolean addNewEmp() {
        // int empid, String ename, double sal, LocalDate jdt
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id : ");
        int empid = sc.nextInt();

        System.out.print("Enter name :");
        String ename = sc.next();

        System.out.print("Enter Salary :");
        double sal = sc.nextDouble();

        System.out.print("Enter Date (dd/MM/yyyy) : ");
        String jdt = sc.next();

        LocalDate date = LocalDate.parse(jdt, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Employee e1 = new Employee(empid, ename, sal, date);
        return edao.save(e1);

    }

    @Override
    public List<Employee> displayAll() {

        return edao.finAll();
    }

    @Override
    public Employee searchById(int id2) {
        return edao.findById(id2);
    }

    @Override
    public Employee searchByName(String nam) {
        return edao.findByName(nam);
    }

    @Override
    public boolean updateSal(int id2, double sal) {
        return edao.updateSalaray(id2, sal);
    }

    @Override
    public boolean deletedById(int id2) {
        return edao.removeById(id2);
    }

    @Override
    public boolean deletedBySal(double sal) {

        return edao.removeBySalary(sal);
    }

    @Override
    public List<Employee> sortByName() {

        return edao.sortByName();
    }

    @Override
    public List<Employee> sortBySal() {


        return edao.sortBySal();
        
    }

}
