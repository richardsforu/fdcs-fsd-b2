package com;

public class Use {

	public static void main(String[] args) {
		
		MyInter mi=new C1();
		mi.f1();
		
		MyInter2 mi2=new C1();
		mi2.f2();

		mi =new C2();
		mi.f1();
		
		mi2=new C2();
		mi2.f2();
		
		

	}

}
