package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee e1=ac.getBean(Employee.class);
		e1.f1();
		
	}

}
