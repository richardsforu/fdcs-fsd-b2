package com;

public class Use {

	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		// setters
		e1.setEmpId(20);
		e1.setEmpName("James");
		e1.setSalary(5000);
		//e1.salary=26342;
		// getters
		//System.out.println(e1.getEmpId());
		//System.out.println(e1.getEmpName());
		//System.out.println(e1.getSalary());
		//System.out.println(e1.salary);
		
		e1.display();

	}

}
