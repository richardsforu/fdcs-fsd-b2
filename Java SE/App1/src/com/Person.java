package com;

public class Person {

	int personId; // instance variable
	String personName; // instance variable
	static String countryName; // static

	void display() { // non static method
		System.out.println("Id: " + personId);
		System.out.println("Name: " + personName);
		System.out.println("----------------------------");
	}

	static void f2() { // static method

		System.out.println("I am f2");

	}

	public static void main(String[] args) {

		int x = 1000;

		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();

		p1.personId = 10;
		p1.personName = "James";

		p2.personId = 11;
		p2.personName = "Bucky";

		p3.personId = 12;
		p3.personName = "Ozvitha";

		p1.display();
		p2.display();
		p3.display();

		
		

	}

}
