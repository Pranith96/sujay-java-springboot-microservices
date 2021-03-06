package com.employee.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "employee_table")
@ApiModel(description = "Details About the Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee_id")
	@ApiModelProperty(notes = "The primary key employee id")
	private Integer employeeId;
	@Column(name = "employee_name")
	@ApiModelProperty(notes = "The empoyee name")
	private String employeeName;
	@Column(name = "mobile_number")
	@ApiModelProperty(notes = "The employee mobile Number")
	private String mobileNumber;
	@Column(name = "email_id", unique = true)
	@ApiModelProperty(notes = "The Unique Email id")
	private String emailId;
	@Column(name = "login_id", unique = true)
	@ApiModelProperty(notes = "The Unique loginid")
	private String loginId;
	@Column(name = "Password")
	@ApiModelProperty(notes = "password")
	private String password;

	// fetch=FetchType.LAZY or FetchType.EAGER
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address adress;

	@ManyToOne(cascade = CascadeType.ALL, targetEntity = Company.class)
	@JoinColumn(name = "company_id")
	private Company company;

	@ManyToMany(cascade = CascadeType.ALL, targetEntity = Projects.class)
	@JoinTable(name = "employee_project", joinColumns = { @JoinColumn(name = "employeeId") }, inverseJoinColumns = {
			@JoinColumn(name = "projectId") })
	private List<Projects> projects;

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	public Employee(Integer employeeId, String employeeName, String mobileNumber, String emailId, String loginId,
			String password) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.loginId = loginId;
		this.password = password;
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + ", loginId=" + loginId + ", password=" + password
				+ ", adress=" + adress + "]";
	}

}
