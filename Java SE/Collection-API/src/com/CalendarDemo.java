package com;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		
		Calendar cl=Calendar.getInstance();
		System.out.println(cl.getTime());
		
		System.out.println(cl.get(Calendar.DATE));
		System.out.println(cl.get(Calendar.MONTH));
		System.out.println(cl.get(Calendar.YEAR));
		
		

	}

}
