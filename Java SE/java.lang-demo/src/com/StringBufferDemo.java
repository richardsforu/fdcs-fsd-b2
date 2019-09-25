package com;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("Abc");
		System.out.println("SB: "+sb);
		System.out.println("DB Hashcode: "+System.identityHashCode(sb));
		
		sb.reverse();
		
		StringBuilder sb1=new StringBuilder("Xyz");
		sb1.reverse();
		
		System.out.println("-----");
		
		System.out.println("SB: "+sb);
		System.out.println("DB Hashcode: "+System.identityHashCode(sb));
		
		
		
	}

}
