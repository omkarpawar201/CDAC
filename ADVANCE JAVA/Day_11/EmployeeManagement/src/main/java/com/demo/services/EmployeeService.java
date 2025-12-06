package com.demo.services;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> display();

	boolean deleteEmployee(int id);

	boolean updateEmployee(int id, double sal);

	boolean assignEmployeeProject(int eid, int pid);

	List<Employee> sortBySal();

}
