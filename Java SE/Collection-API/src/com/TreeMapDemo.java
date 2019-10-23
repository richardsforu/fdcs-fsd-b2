package com;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Object, Object> hm = new TreeMap<>();

		hm.put("name", "Praveen");
		hm.put("username", "admin");
		hm.put("pwd", "123456");
		hm.put("aity", "Kolkata");
		hm.put("username", "admin1");
		hm.put("empname", "Praveen");
		// hm.put(null, "bla");
		// hm.put(7373, null);
		// hm.put(null, null);

		System.out.println(hm);

	}

}
