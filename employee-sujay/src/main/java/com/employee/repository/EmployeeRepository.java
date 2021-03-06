package com.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	// List<Employee> findByEmployeeName(String employeeName);

	// JPQL
	// @Query("select e from Employee e where e.employeeName = :employeeName and e.loginId = :login")
	// List<Employee> getDataByEmployeeName(String employeeName, String login);
	
	//SQL 
	//@Query(value = "select * from employee_table where e.employee_name = :employeeName", nativeQuery = true)
	//List<Employee> getDataByEmployeeName(String employeeName);

	@Query("select e from Employee e where e.employeeName = :employeeName")
	List<Employee> getDataByEmployeeName(String employeeName);

	@Modifying
	@Query("update Employee e set e.mobileNumber = :mobileNumber where e.employeeId=:employeeId")
	void updateMobileNumber(Integer employeeId, String mobileNumber);

}
