package com.ab.test;

public class Emp {
	private int empId;
	private String empName;
	private String empType;
	
	//default constructor
	public Emp() {
	}

	//grtter method
	public int getEmpId() {
		return empId;
	}

	//setter method
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	//grtter method
	public String getEmpName() {
		return empName;
	}

	//setter method
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	//grtter method
	public String getEmpType() {
		return empType;
	}

	//setter method
	public void setEmpType(String empType) {
		this.empType = empType;
	}

	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empType="
				+ empType + "]";
	}

}
