package com;

public class Use {

	public static void main(String[] args) {
	
		C2 obj1=new C2();
		obj1.disp();
		//C2 obj2=new C2();
		//C2 obj3=new C2();
		//C2 obj4=new C2();
		//C2 obj5=new C2();
		//C2 obj6=new C2();
		
		obj1=C1.getObject();
		C2 obj2=C1.getObject();
		C2 obj3=C1.getObject();
		C2 obj4=C1.getObject();
		C2 obj5=C1.getObject();
		C2 obj6=C1.getObject();
		
		obj2.disp();
		obj3.disp();
		obj4.disp();
		obj5.disp();
		obj6.disp();
		
		
		

	}

}
