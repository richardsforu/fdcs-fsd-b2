package com;

import java.util.HashMap;
import java.util.Set;

public class HashMapDem {

	public static void main(String[] args) {

		HashMap<Object, Object> hm = new HashMap<>();
		hm.put("name", "Praveen");
		hm.put("username", "admin");
		hm.put("pwd", "123456");
		hm.put(65, 48347494);
		hm.put("username", "admin1");
		hm.put(86486466, "Praveen");
		hm.put(null, "bla");
		hm.put(7373, null);
		hm.put(null, null);

		System.out.println(hm);

		// get a value using key

		System.out.println(hm.get(86486466));
		System.out.println(hm.get("pwd"));

		// remove

		hm.remove("pwd");
		System.out.println(hm);

		// use loop

		// copy all keys into set

		Set<Object> keys = hm.keySet();

		System.out.println("-----------------");
		for (Object key : keys) {
			System.out.println(hm.get(key));
		}
		// copy key and values into set
		
		System.out.println("------------------");
		Set data= hm.entrySet();

		for(Object obj:data) {
			System.out.println(obj);
		}
	}

}
