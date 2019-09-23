package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AcceptElements {
	
	public static void main(String[] args) {
		
		int marks[]=new int[5];
		System.out.println("Enter marks for 5 subjects");
		Scanner sc=new Scanner(System.in);
		
		
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Marks");
		for(int sub:marks) {
			System.out.println(sub);
		}
		
		
	}

}
