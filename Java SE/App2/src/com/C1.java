package com;


public class C1 {
	
	
	
	public static void main(String[] args) {
	
		/*
		C3 c3=new C3();
		C3 c3Obj1=new C3();
		C3 c3Obj2=new C3();
		C3 c3Obj3=new C3();
		C3 c3Obj4=new C3();
		
		c3.displayData();
		c3Obj1.displayData();
		c3Obj2.displayData();
		c3Obj3.displayData();
		c3Obj4.displayData();
		
		*/
		
		//---------------------------------
		
		
		
		C3 c3Obj1=C2.getObject();
		c3Obj1.displayData();
		c3Obj1.f1();
		c3Obj1.f2();
		
		C3 c3Obj2=C2.getObject();
		c3Obj2.displayData();
		
		C3 c3Obj3=C2.getObject();
		c3Obj3.displayData();
		//---
		//---
		
		C3 c3Obj4=C2.getObject();
		c3Obj4.displayData();
		
		
		
		//----------------------------------
		
		
		C2.getObject().displayData();
		C2.getObject().displayData();
		C2.getObject().displayData();
		C2.getObject().displayData();
		C2.getObject().displayData();
		
		System.out.println();
		
		//PrintStream ps= System.out;
		//ps.println("--- Testing");
		
		
	}

}
