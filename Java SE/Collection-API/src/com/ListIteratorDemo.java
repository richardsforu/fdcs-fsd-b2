package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<>();

		ar.add("Praveen");
		ar.add(384737777);
		ar.add('H');
		ar.add(true);
		ar.add("Praveen");
		ar.add("Cognizant");
		
		// 4. ListIterator Interface

		ListIterator<Object> li=ar.listIterator();
		
		System.out.println(ar);
		System.out.println("-------------");
		while(li.hasNext()) {
			Object obj=li.next();
			if(obj.equals(true)) {
				li.set(false);
				continue;
			}
			System.out.println(obj);
		}
		
		System.out.println(ar);
		
		
		System.out.println("------------------");
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		
		
		

	}

}
