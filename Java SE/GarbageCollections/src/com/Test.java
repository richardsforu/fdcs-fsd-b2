package com;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		System.out.println("Hi");

		Runtime rt= Runtime.getRuntime();
		System.out.println("Total Memory: "+rt.totalMemory());
		
		System.out.println("Free memory: "+rt.freeMemory());

		
		
		for(int i=1;i<=1000000;i++) {
			new Employee();
		}
		
		System.out.println("Free memory: "+rt.freeMemory());
		System.out.println("Memory used: "+(rt.totalMemory()-rt.freeMemory()));
		
		
		
		
		
	}

}
