package com;

import org.springframework.stereotype.Component;

@Component(value = "emp")
public class Employee {

	public Employee() {
		System.out.println("-- Employee object created");
	}

	public void f1() {
		System.out.println("--- f1 methof of employee class");
	}
}
