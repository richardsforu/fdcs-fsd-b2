package com;

public class ToStringDemo {
	
	/*
	 * toString();
	 * -> This method converts anything into string
	 * 
	 *  Types of classes
	 *  ------------------
	 *  1. Simple class
	 *  	-> Who can hold single value
	 *  2. Complex class
	 *  	-> who can hold multiple values
	 * 
	 *   Note: toString method autoimetically caklled by the 
	 *         JVM on every object invocations implecitly
	 */
	public static void main(String[] args) {
		
		Employee e1=new Employee(10, "Praveen", 10000);
		Employee e2=new Employee(11, "Ozvitha", 20000);

		
		System.out.println(e1);
		System.out.println(e2);
		
		
		
		
	}

}
