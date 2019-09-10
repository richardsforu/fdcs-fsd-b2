package com;

public class Use {

	public static void main(String[] args) {
		
		
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		//System.out.println("Hashcode of e1: "+e1.hashCode());
		//System.out.println("Hashcode of e2: "+e2.hashCode());
		
		e1.setEmployeeData(100,"Praveen",38464); // Actual Argument
		e2.setEmployeeData(101,"James",84585); // Actual Argument
		
		
		e1.display();
		e2.display();
		
		

	}

}
