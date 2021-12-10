package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String addEmployee(Employee employee) {
		Employee employeeResponse = employeeRepository.save(employee);
		if (employeeResponse == null) {
			return "Employee details not saved";
		}
		return "Employee Details saved successfully";
	}

	@Override
	public List<Employee> getEmployees() {
		List<Employee> response = employeeRepository.findAll();
		if (null == response || response.isEmpty()) {
			throw new RuntimeException("data is not there");
		}
		return response;
	}

	@Override
	public Employee getEmployeeById(Integer studentId) {
		Optional<Employee> employeeResponse = employeeRepository.findById(studentId);
		if (!employeeResponse.isPresent()) {
			throw new RuntimeException("Data not found");
		}
		return employeeResponse.get();
	}

	@Override
	public List<Employee> getEmployeeByName(String employeeName) {
		List<Employee> response = employeeRepository.findByEmployeeName(employeeName);
		if (null == response || response.isEmpty()) {
			throw new RuntimeException("data is not there");
		}
		return response;
	}

}
