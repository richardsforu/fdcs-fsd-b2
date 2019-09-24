package com;

public class HashCodeDemo {

	public static void main(String[] args) {

		System.out.println("-- Main ");

		Employee e1 = new Employee(100, "Praveen", 20000);
		Employee e2 = new Employee(100, "Praveen", 20000);

		System.out.println("E1 Hashcode: " + e1.hashCode());
		System.out.println("E2 Hashcode: " + e2.hashCode());

		System.out.println("-----------------");
		System.out.println("Identity Hashcode of E1: " + System.identityHashCode(e1));
		System.out.println("Identity Hashcode of E2: " + System.identityHashCode(e2));

		System.out.println("---------------------");

		if (e1.equals(e2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equal");
		}

		
		
		
		
		
	}

}
