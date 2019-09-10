package com;

public class Use {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		
		s1.setStudentData(10, "Praveen");
		s2.setStudentData(11, "James");
		
		s1.registerStudent();
		s2.registerStudent();
		
		
	}

}
