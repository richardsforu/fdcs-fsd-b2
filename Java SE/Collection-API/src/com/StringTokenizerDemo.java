package com;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String msg="This is Praveen,Reddy";
		
		StringTokenizer st=new StringTokenizer(msg,"");
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
		
		

	}

}
