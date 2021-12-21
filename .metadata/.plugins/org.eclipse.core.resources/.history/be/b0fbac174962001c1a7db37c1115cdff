package com.employee.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.exception.EmployeeNoContentException;
import com.employee.exception.EmployeeNotFoundException;
import com.employee.exception.EmployeeNotFoundException2;
import com.employee.repository.EmployeeRepository;

@Service
@Transactional
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
			throw new EmployeeNoContentException("Employee has empty records");
		}
		return response;
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		Optional<Employee> employeeResponse = employeeRepository.findById(employeeId);
		if (!employeeResponse.isPresent()) {
			throw new EmployeeNotFoundException2("Employee Id Not Found");
		}
		return employeeResponse.get();
	}

	@Override
	public List<Employee> getEmployeeByName(String employeeName) {
		// JPA QUERY
		// List<Employee> response =
		// employeeRepository.findByEmployeeName(employeeName);
		List<Employee> response = employeeRepository.getDataByEmployeeName(employeeName);
		if (null == response || response.isEmpty()) {
			throw new EmployeeNotFoundException("Employee Name not found ");
		}
		return response;
	}

	@Override
	public String updateEmployee(Employee employee) {
		Optional<Employee> employeeResponse = employeeRepository.findById(employee.getEmployeeId());
		if (!employeeResponse.isPresent()) {
			throw new EmployeeNotFoundException("Employee Id Not Found");
		}
		if (employee.getEmployeeName() != null) {
			employeeResponse.get().setEmployeeName(employee.getEmployeeName());
		}
		if (employee.getMobileNumber() != null) {
			employeeResponse.get().setMobileNumber(employee.getMobileNumber());
		}
		if (employee.getPassword() != null) {
			employeeResponse.get().setPassword(employee.getPassword());
		}
		if (employee.getLoginId() != null) {
			employeeResponse.get().setLoginId(employee.getLoginId());
		}
		if (employee.getEmailId() != null) {
			employeeResponse.get().setEmailId(employee.getEmailId());
		}
		employeeRepository.save(employeeResponse.get());
		return "updated data succesfully";
	}

	@Override
	public String deleteEmployeeById(Integer employeeId) {
		Optional<Employee> employeeResponse = employeeRepository.findById(employeeId);
		if (!employeeResponse.isPresent()) {
			throw new EmployeeNotFoundException("Employee Id Not Found");
		}
		employeeRepository.deleteById(employeeId);
		return "Deleted successfully";
	}

	@Override
	public String updateEmployeeMobileNumber(Integer employeeId, String mobileNumber) {
		employeeRepository.updateMobileNumber(employeeId, mobileNumber);
		return "Employee Mobile Number updated";
	}

}
