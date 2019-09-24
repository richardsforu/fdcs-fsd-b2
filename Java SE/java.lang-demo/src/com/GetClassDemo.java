package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class GetClassDemo {
	
	public static void main(String[] args) {
		
		
		C2 c2=new C2();
	
		
		System.out.println(c2.getClass());
		System.out.println(c2.getClass().getName());
		//System.out.println(c2.getClass().getSuperclass().getSuperclass());
		
		// all fields in c2 class
		
		Field[] fields= c2.getClass().getDeclaredFields();
		
		  for(Field field:fields) {
			  System.out.println(field);
		  }
		  
		  System.out.println("----------");
		  
		  Method[] methods=C2.class.getMethods();
		  
		  for(Method method:methods) {
			  System.out.println(method);
		  }
		  
		  System.out.println("-------------");
		// Constructor<?>[] cs=  C2.class.getConstructors();
		  Constructor<?>[] cs= c2.getClass().getConstructors();
		  
		 for(Constructor<?> c1:cs) {
			 System.out.println(c1);
		 }
		  
		
		
		
		
		
	}

}
