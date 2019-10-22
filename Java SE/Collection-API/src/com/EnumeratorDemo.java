package com;

import java.util.Enumeration;
import java.util.Stack;

public class EnumeratorDemo {

	public static void main(String[] args) {

		Stack<Object> ar = new Stack<>();

		ar.add("Praveen");
		ar.add(384737777);
		ar.add('H');
		ar.add(true);
		ar.add("Praveen");
		ar.add("Cognizant");
		
		// 5. Enumerator Interface

		
		Enumeration<Object> en=ar.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		

	}

}
