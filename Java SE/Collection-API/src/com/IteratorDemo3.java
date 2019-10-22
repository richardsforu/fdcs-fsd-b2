package com;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo3 {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();

		ar.add("Praveen");
		ar.add(384737777);
		ar.add('H');
		ar.add(true);
		ar.add("Praveen");

		// 3. Iterator Interface

		Iterator<Object> it = ar.iterator();

		while (it.hasNext()) {
			Object obj = it.next();
			if (obj.equals("Praveen")) {
				it.remove();
				continue;
			}
			System.out.println(obj);
		}
		
		// ---
		System.out.println(ar);

	}

}
