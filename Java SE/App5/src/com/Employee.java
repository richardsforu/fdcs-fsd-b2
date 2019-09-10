package com;

public class Employee {

	int empId;
	String empName;
	double salary;

	void setEmployeeData(int empId, String empName, double salary) { // Formal argument
		// System.out.println("In Method: Hashcode: "+this.hashCode());
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	void display() {
		// System.out.println("In display: Hashcode: "+this.hashCode());
		System.out.println("Employee Id: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("-------------------------");

	}

}
