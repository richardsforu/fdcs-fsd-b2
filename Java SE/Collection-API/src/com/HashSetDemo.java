package com;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<Object> hs = new HashSet<>();
		/*
		 * Non Indexed Do Duplicates - Unique
		 * 
		 */

		hs.add("Praveen");
		hs.add("James");
		hs.add(6763);
		hs.add(false);
		hs.add('A');
		hs.add("Bob");
		hs.add("James");

		System.out.println(hs);

		// Operations

		// Find ?

		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
		}

		// -------------------

		System.out.println(hs);

	}

}
