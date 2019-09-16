package com;

public class Use {
	
	/*
	 *  Object
	 *  -------
	 *   1. behavior
	 *   		-> properties
	 *   2. action
	 *   		-> methods
	 *   
	 *   //  Annotation
	 *   ------------------
	 *   
	 */

	public static void main(String[] args) {
		
		
		int x=100;

		
		
		RegularEmployee re=new RegularEmployee();
		ContractEmployee ce=new ContractEmployee();
		
		re.setEmpId(10);
		re.setEmpName("James");
		//re.setSalary(10000);
		re.setNoofDaysWorked(22);
		
		ce.setEmpId(11);
		ce.setEmpName("Praveen");
		//ce.setSalary(20000);
		ce.setNoOfHoursWorked(150);
		
		// process salary
		re.processSalary();
		ce.processSalary();
		
		
		re.display();
		ce.display();
		
		

	}

}
