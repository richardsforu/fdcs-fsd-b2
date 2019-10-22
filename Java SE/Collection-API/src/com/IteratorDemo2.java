package com;

import java.util.ArrayList;

public class IteratorDemo2 {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();

		ar.add("Praveen");
		ar.add(384737777);
		ar.add('H');
		ar.add(true);
		ar.add("Praveen");

		// 2. For each

		for (Object obj : ar) {
			if(obj.equals("Praveen"))
				ar.remove(obj);
			
			System.out.println(obj);
		}

	}

}
