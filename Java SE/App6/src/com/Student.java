package com;

public class Student {

	int regNo;
	String studentName;

	void setStudentData(int regNo, String studentName) {
		this.regNo = regNo;
		this.studentName = studentName;
	}
	
	
	void registerStudent() {
		
		Teacher t=new Teacher();
		t.display(this); // actual
		t.f1(100);
		
	}
	

}
