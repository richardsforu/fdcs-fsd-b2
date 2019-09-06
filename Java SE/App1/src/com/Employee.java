package com;

public class Employee {
	/*
	 *  class
	 *  -------
	 *  1. Properties/fields/variables
	 *  2. Methods
	 *  3. Constructors
	 *  4. class
	 *  5. interface
	 *  
	 *  Types of classes
	 *  ------------------
	 *  1.Concrete class
	 *  2.Abstract class
	 *  3.Final class
	 *  
	 *  ------------------------
	 *  
	 *  1. Properties/fields/variables
	 *  	- instance properties
	 *  	- static properties
	 *  	- final properties
	 *  	- volatile properties
	 *  	- transient properties
	 *  
	 *  ----------------------------------
	 *  
	 *  2. methods
	 *  	- non static method
	 *  	- static method
	 *  	- abstract method
	 *  	- final method
	 *  	- native method
	 *  
	 * ------------------------------------
	 *  
	 *  
	 *  
	 *  
	 */
	
	 static  String companyName;

	public static void main(String[] args) {
		
		
		Person obj=new Person();
		obj.personId=1;
		obj.personName="James";
		
		obj.display();
		
		Person.f2();
		

	}

}
