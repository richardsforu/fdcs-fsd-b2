package com;

public class Demo {

	void f1(int x) {
		System.out.println("Int:  " + x);
	}

	void f1(short x) {
		System.out.println("Short:  " + x);
	}

	void f1(long x) {
		System.out.println("Long:  " + x);
	}

	void f1(float x) {
		System.out.println("Float:  " + x);
	}

	void f1(String x) {
		System.out.println("String :  " + x);
	}

	void f1(char x) {
		System.out.println("Char:  " + x);
	}

	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.f1('S');
		d.f1(333);

	}

}
