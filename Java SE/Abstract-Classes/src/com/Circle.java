package com;

public class Circle extends Shape {

	@Override
	public void f1() {
		
		System.out.println("Circle class f1 method");
		super.f1();
		super.f3();
		
	}
	
	public void blabla() {
		System.out.println("-- bloa bla");
	}

	@Override
	public void draw() {
		
		System.out.println("Circle class draw method");

	}

	@Override
	public void f2() {
		System.out.println("Circle class f2 method");

	}

}
