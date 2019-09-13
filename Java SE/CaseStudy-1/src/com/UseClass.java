package com;

public class UseClass {

	public static void main(String[] args) {
		Student s1 = new Student("Abc", "Married", 10, 'M', "10/7/1987", "HYDERABAD", "abc@abc.com", "xyz@xyz.com",
				9876543765L, "Java", "Mtech", "Indian");
		s1.registerStudent();

		if (s1.getAdmissionId() != null) {
			s1.registerForExam();
		}

		String result = s1.appearForExam();
		System.out.println("Result: " + result);

	}

}
