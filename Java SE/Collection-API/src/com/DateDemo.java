package com;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		System.out.println(date.getDate());
		System.out.println((date.getMonth())+1);
		System.out.println(date.getYear()+1900);
		
		

	}

}
