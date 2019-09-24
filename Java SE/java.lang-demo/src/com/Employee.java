package com;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	

	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int empId, String empName, double salary) {
		
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee emp=(Employee) obj;
		
		if(emp.getEmpId()==this.getEmpId()  && emp.getEmpName().equals(this.getEmpName()) && emp.getSalary()==this.getSalary()) {
			return true;
		}
		
		return false;
	}
	
	
	
	@Override
	public String toString() {
		return empName+" with employee id "+empId+" is drawing INR "+salary+" salary";
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
