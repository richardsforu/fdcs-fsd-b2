package com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Object> ar=new LinkedList<>();
		
		
		
		ar.add("Praveen");
		ar.add(384737777);
		ar.add('H');
		ar.add(true);
		ar.add("Praveen");
		
		System.out.println(ar);
		
		System.out.println(ar.size()); // size
		System.out.println(ar.get(1)); // find
		
		//ar.add(1, "James"); // index based
		
		System.out.println(ar);
		
		// update 
		
		ar.set(2, "Data");
		System.out.println("---------");
		System.out.println(ar);
		
		// remove
		ar.remove(1); // with index
		System.out.println("--------------");
		System.out.println(ar); 
		//System.out.println(ar.size());
		
		ar.remove(new Boolean(true)); // with content
		
		System.out.println("-------------------");
		System.out.println(ar);
		
		System.out.println("-----------------------");
		
		// two wsys 
		// 1. for loop with index
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		// 2. for each -> Jsut for display
		
		System.out.println("=================");
		
		for(Object obj:ar) {
			System.out.println(obj);
		}
		
		//ar.clear();
	
		
		System.out.println(ar);
		
		System.out.println(ar.contains("James"));
		
		
		

	}

	void f1(int x) {
			System.out.println("Int:  "+x);
		}

}
