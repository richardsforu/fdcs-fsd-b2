package com;


public class StringDemo {
	

	/*
	 * String ---------- 
	 * Types of objects -> Two Types 
	 * 1.Immutable -> An object's content can not be changed 
	 *   Ex: String , all wrapper class 
	 * 2.Mutable -> An object's content can be changed 
	 *   Ex: StringBuffer, StringBuilder .. etc
	 * 
	 * 
	 */
	

	public static void main(String[] args) {

		String s1 = "Abc";

		System.out.println("S1: " + s1);
		System.out.println("S1 Hashcode: " + System.identityHashCode(s1));

		String s2 = new String("Abc");

		System.out.println("-------");

		System.out.println("S2: " + s2);
		System.out.println("S2 Hashcode: " + System.identityHashCode(s2));
		
		
		if(s1.equals(s2)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not equals");
		}
		
		
		
		
		
		
		

	}

}
