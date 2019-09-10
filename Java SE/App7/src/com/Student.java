package com;

public class Student {

	int regNo;
	String studentName;
	
	/*
	 * -> Constructor is a special method block which is invoked when the object is created
	 * -> Constructor name and  class name must be same
	 * -> Constructor should not return any value including void
	 * -> Constructors can have arguments.
	 * -> A constructor with no arguments is called 'default constructor'
	 * -> A constructor with arguments is called 'x argument constructor' where x is the no of arguments
	 * 
	 * Note: JVM adds a default constructor on its own when you dont provide any argument constructr
	 */
	
	/*
	Student() {
		System.out.println("--- Student class object created..");
		regNo=10;
		studentName="James";
	}
	*/
	
	
	Student(int regNo,String studentName){
		this.regNo=regNo;
		this.studentName=studentName;
	}
	
	

	void setStudentData(int regNo, String studentName) {
		this.regNo = regNo;
		this.studentName = studentName;
	}

	void registerStudent() {

		Teacher t = new Teacher();
		t.display(this); // actual
		t.f1(100);

	}

}
