package com.ab.test;

public class Emp {
	private int empId;
	private String empName;
	private String empType;
	
	public Emp() {
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empType="
				+ empType + "]";
	}

}
