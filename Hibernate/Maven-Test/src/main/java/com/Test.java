package com;

public class Test {

	public static void main(String[] args) {

		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded");
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
		
	}

}
