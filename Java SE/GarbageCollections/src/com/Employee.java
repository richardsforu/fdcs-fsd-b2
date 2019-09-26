package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	
	static int count=1;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("--- Object is Garbage Collected "+count++);
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
