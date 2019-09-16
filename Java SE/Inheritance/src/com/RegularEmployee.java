package com;

public class RegularEmployee extends Employee {

	private int noofDaysWorked;

	public int getNoofDaysWorked() {
		return noofDaysWorked;
	}

	@Override
	public void processSalary() {

		this.setSalary(noofDaysWorked * 7500);
	}

	public void setNoofDaysWorked(int noofDaysWorked) {
		this.noofDaysWorked = noofDaysWorked;
	}

}
