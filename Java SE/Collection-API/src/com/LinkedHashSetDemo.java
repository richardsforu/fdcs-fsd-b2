package com;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet<Object> hs = new LinkedHashSet<>();
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
