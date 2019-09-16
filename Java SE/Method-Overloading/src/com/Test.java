package com;

public class Test {
	/*
	 * Polymorphism
	 * ----------------
	 * -> Appearing in many forms
	 * 
	 * Two Types
	 * 1. Static polymorphism  -> Compile time polymorphism / early binding
	 * 		Ex: method overloading
	 * 2. Dynamic Polymorphism -> Runtime polymorphism /late binding
	 * 		Ex: method overriding
	 * 
	 * 
	 * method overriding
	 * -------------------
	 * -> Defining same method signature in sub  class
	 * 
	 */
	
	
	
	
	/*
	 *  Method overloading
	   ----------------------
	   -> Defining same method name with different signature in the same class
	   
	    what is method signature
	    ------------------------
	    	-> name of method
	    	-> number of arguments
	    	-> type of arguments
	    	-> position or order of arguments
	    	
	     Ex: void fun(int x,float y);
	 * 		 void fun(float x,int y);
	 */
	
	
	  
	  //----------------
	  
	  void f1(float x) {
		  System.out.println("float "+x);
	  }
	  void f1(double x) {
		  System.out.println("double "+x);
	  }
	
	  //----------------
	  
	  void f1(String x) {
		  System.out.println("String "+x);
	  }
	  
	  void f1(char x) {
		  System.out.println("char "+x);
	  }
	  
	  void f1(boolean x) {
		  System.out.println("boolean "+x);
	  }
	  
	  void f1(int x,float y) {
		  
	  }
	  
	  void f1(float y,int x) {
		  
	  }
	  
	  //-----------
	  
	  void f1(int x) {
		  System.out.println("Int: "+x);
	  }
	  
	  void f1(long x) {
		  System.out.println("long "+x);
	  }
	  
	  void f1(byte x) {
		  System.out.println("byte "+x);
	  }
	  
	  void f1(short x) {
		  System.out.println("short "+x);
	  }

	public static void main(String[] args) {
		
		Test t=new Test();
		//t.f1((char)97);
		
		t.f1(34); // int
		//t.f1((byte)76); // Byte
		//t.f1((short)76); // short
		//t.f1(76); // int
		//t.f1(76L); // long

		
		

	}

}
