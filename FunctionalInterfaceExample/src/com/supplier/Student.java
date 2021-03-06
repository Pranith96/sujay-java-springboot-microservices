package com.supplier;

public class Student {

	private Integer id;
	private String studentName;
	private String mobileNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Student(Integer id, String studentName, String mobileNumber) {
		this.id = id;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber + "]";
	}

}
