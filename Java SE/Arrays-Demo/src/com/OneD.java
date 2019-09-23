package com;

public class OneD {

	public static void main(String[] args) {
		
		/*
		 * 
		 * -> Every array index starts with zero and ends with n-1. where
		 *    n is the total number of elements in an array
		 * -> Size of the array must be positive integer number
		 * -> By default all array index elements values are zero
		 * 
		 * 1D
		 * -----
		 * Can be defined in two ways
		 * way-1
		 * ------
		 * array with initialization
		 * 
		 * way -2
		 * ---------
		 * array with fixed size
		 */
		int[] x= {10,20,30,76,34,23,323,43,23};
		
		System.out.println("X size: "+x.length);
		
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		
		System.out.println("-------------");
		
		int[] x1=new int[50];
		float[] f=new float[10];
		
		
		System.out.println("I size:  "+x1.length);
		
		x1[0]=100;
		System.out.println(x1[4]);
		
		System.out.println("---------------------");
		
		// Iterations on array
		// 2 ways
		//1 using for loop
		
		for(int i=0;i<x.length;i++) {
			//if(x[i]%2==0)
			//	continue;
			System.out.println(x[i]);
		}
		
		System.out.println("-----------------");
		

		for(int i=x.length-1;i>=0;i--) {
			//if(x[i]%2==0)
			//	continue;
			System.out.println(x[i]);
		}
		
		System.out.println("----------");
		
		// 2 using for each loop
		
		
		int[] x2= {10,20,50,55};
		float[] f1= {76.34f,87.43f,87.54f};
		
		
		for(float element:f1) {
			System.out.println(element);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
