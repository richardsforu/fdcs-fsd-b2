package com;

import java.io.Serializable;

public class Employee implements Serializable {

	
	private static final long serialVersionUID = 43;
	
	private int empId;
	private String empName;
	private double salary;
	transient String password = "SOmething..";
	int age;
	

	int x;
	
	transient int y;
	
	void f1() {
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
