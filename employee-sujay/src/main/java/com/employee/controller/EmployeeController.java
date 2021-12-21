package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/save")
	@ApiOperation(value = "Employee Creation API", notes = "Please provide all the info for Employee creation", response = Employee.class)
	public ResponseEntity<String> createEmployee(@RequestBody Employee employee) {
		String response = employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping("/get/data")
	@ApiOperation(value = "EMPLOYEE list details API", notes = "get all employee details", response = Employee.class)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> response = employeeService.getEmployees();
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/{employeeId}")
	@ApiOperation(value = "Employee get details by id API", notes = "Get employee details by passing employee id", response = Employee.class)
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId) {
		Employee response = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get/name/{employeeName}")
	@ApiOperation(value = "Employee deetails by name API", notes = "Get employee's list details by passing employee name", response = Employee.class)
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable("employeeName") String employeeName) {
		List<Employee> response = employeeService.getEmployeeByName(employeeName);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployeeByEmployeeId(@RequestParam("employeeId") Integer employeeId) {
		Employee response = employeeService.getEmployeeById(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateEmployee(@RequestBody Employee employee) {
		String response = employeeService.updateEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@DeleteMapping("/delete/{employeeId}")
	public ResponseEntity<String> deleteEmployeeById(@PathVariable("employeeId") Integer employeeId) {
		String response = employeeService.deleteEmployeeById(employeeId);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}

	@PutMapping("/get/{employeeId}/{mobileNumber}")
	public ResponseEntity<String> updateEmployeeMobileNumber(@PathVariable("employeeId") Integer employeeId,
			@PathVariable("mobileNumber") String mobileNumber) {
		String response = employeeService.updateEmployeeMobileNumber(employeeId, mobileNumber);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
}
