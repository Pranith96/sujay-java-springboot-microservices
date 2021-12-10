package com.employee.service;

import java.util.List;

import com.employee.entity.Employee;

public interface EmployeeService {

	String addEmployee(Employee employee);

	List<Employee> getEmployees();

	Employee getEmployeeById(Integer employeeId);

	List<Employee> getEmployeeByName(String employeeName);

}
