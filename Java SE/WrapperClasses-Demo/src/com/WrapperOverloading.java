package com;

import static java.lang.System.*;

public class WrapperOverloading {
	
	enum gender {MALE,FEMALE};

	void f1(int... numbers) {
		for (int n : numbers)
			System.out.println(n);
	}

	void f1(Integer x) {
		out.println("Integer X: " + x);
	}

	public static void main(String[] args) {

		WrapperOverloading wd = new WrapperOverloading();

		Integer i = new Integer(100);

		int x = i.intValue();
		int i1=100;
		float f1=i1; // auto casting
		
		float f2=34.56f;
		Float floatObj=354.76f;
		//int i2=(int)f2; // 
		
		int i2=floatObj.intValue();
		byte b=floatObj.byteValue();
		long l=floatObj.longValue();
		
		Integer intObj=6444;
		System.out.println("IB: "+System.identityHashCode(intObj));
		intObj=3663;
		System.out.println("IB: "+System.identityHashCode(intObj));
		byte b2=intObj.byteValue();
		
		int i4=764;
		System.out.println(Integer.toBinaryString(i4));
		System.out.println(Integer.toHexString(i4));
		
		
		
		System.out.println(i2);
		
		

		wd.f1(10);
		
		System.out.println(gender.MALE);
		System.out.println(Countries.INDIA);

	}

}
