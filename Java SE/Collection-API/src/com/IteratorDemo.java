package com;

import java.util.ArrayList;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();

		ar.add("Praveen");
		ar.add(384737777);
		ar.add('H');
		ar.add(true);
		ar.add("Praveen");

		/*
		 * How many ways can be iterated over the collection objects
		 * 
		 * 1. for loop -> index based operations 2. for each -> just to display objects
		 * from a collection 3. Iterator interface 4. ListIterator interface 5.
		 * Enumerator interface
		 */

		// 1. for loop -> index based operations

		System.out.println(ar);
		for (int i = 0; i < ar.size(); i++) {
			Object obj=ar.get(i);
			if(obj.equals("Praveen")) {
				ar.remove(i);
				continue;
			}
				
			System.out.println(ar.get(i));
		}
		
		//-------------
		System.out.println(ar);

	}

}
