package Dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.java.beans.Employee;

public class EmployeeDao implements EmployeeDaoInter {
    static List<Employee> emplist;

    static {
        emplist = new ArrayList<>();
        // int empid, String ename, double sal, LocalDate jdt
        emplist.add(new Employee(100, "abc", 50000, LocalDate.of(2005, 10, 12)));
        emplist.add(new Employee(101, "def", 80000, LocalDate.of(2006, 10, 25)));
        emplist.add(new Employee(102, "xyz", 70000, LocalDate.of(2007, 10, 5)));
    }

    @Override
    public List<Employee> finAll() {

        return emplist;
    }

    public boolean save(Employee e1) {
        emplist.add(e1);
        return true;
    }

    public Employee findById(int id2) {

        for (Employee employee : emplist) {
            if (employee.getEmpid() == id2) {
                return employee;
            }
        }
        return null;
    }

    public Employee findByName(String nam) {
        for (Employee employee : emplist) {
            if (employee.getEname().equals(nam)) {
                return employee;
            }
        }
        return null;
    }

    public boolean updateSalaray(int id2, double sal) {
        Employee e = findById(id2);

        e.setSal(sal);

        return true;
    }

    public boolean removeById(int id2) {
        return emplist.remove(new Employee(id2));
    }

    public boolean removeBySalary(double sal) {
        return emplist.removeIf(emp -> emp.getSal() > sal);

    }

    public List<Employee> sortByName() {
        List<Employee> lst = new ArrayList<>();

        for (Employee e : emplist) {
            lst.add(e);
        }

        Comparator<Employee> c = (o1, o2) -> {
            return o1.getEname().compareTo(o2.getEname());
        };
        lst.sort(c);

        return lst;
    }

    public List<Employee> sortBySal() {
        List<Employee> lst = new ArrayList<>();

        for (Employee e : emplist) {
            lst.add(e);
        }

        Comparator<Employee> c = (o1, o2) -> {
            return (int) (o1.getSal() - o2.getSal());
        };
        
        lst.sort(c);
        return lst;
    }

}
