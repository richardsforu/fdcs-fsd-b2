package com;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RangeTest {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number  of subjets ");
		int size=sc.nextInt();
		int marks[]=new int[size];
		System.out.println("Enter marks for "+size+" subjects");
		
		
		
		
		for(int i=0;i<marks.length;i++) {
			marks[i]=sc.nextInt();
		}
		
		System.out.println("Marks");
		for(int sub:marks) {
			System.out.println(sub);
		}
		
		
	}

}
