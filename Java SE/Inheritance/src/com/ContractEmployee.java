package com;

public class ContractEmployee extends Employee {

	private int noOfHoursWorked;

	public int getNoOfHoursWorked() {
		return noOfHoursWorked;
	}

	public void setNoOfHoursWorked(int noOfHoursWorked) {
		this.noOfHoursWorked = noOfHoursWorked;
	}

	@Override
	public void processSalary() {
		this.setSalary(noOfHoursWorked * 1000);
	}

	@Override
	public void display() {
		System.out.println("Id: " + this.getEmpId());
		System.out.println("Name: " + this.getSalary());

	}

}
