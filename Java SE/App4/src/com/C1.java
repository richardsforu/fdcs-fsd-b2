package com;

public class C1 {
	
	int age;

	int f1(int x) { // called method / defination
		x = 5000;
		System.out.println("-- In f1 X: " + x);
		return x;
	}
	
   

	public static void main(String[] args) {
		C1 c1 = new C1();
		c1.age=76;
		
		C2 c2=new C2();
		System.out.println("Before Calling: Age: "+c1.age);
		c2.processData(c1);
		System.out.println("After Calling: Age: "+c1.age);
		
		
		//int x = 100;
		//System.out.println("before calling f1 X: " + x);
		
		//int res=c1.f1(x); // calling method // declaration
		
		//System.out.println("After calling f1 X: " + x);
		//System.out.println("Result after  calling f1 X: " + res);

	}

}
