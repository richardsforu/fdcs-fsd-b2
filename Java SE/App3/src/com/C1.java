package com;

public class C1 {

	void f1() {
		System.out.println("f1 method of C1 class");

	}
	
	static void f3() {
		// always objects required to access any non static data
		C1 c1=new C1();
		c1.f1();
		
	}

	void f2() {
		System.out.println("-- f2 method of C1 class");
		f1(); // accepted. Object not required to access same class non static methods
		
		C2 c2=new C2();
		c2.f2(); // Object required as f2 belongs to other class.
	}

	public static void main(String[] args) {
		// always objects required to access any non static data
		
		C1 c1 = new C1();
		c1.f2();

	}

}
