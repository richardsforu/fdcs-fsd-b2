package com;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int x = sc.nextInt();

		sc.nextLine(); // dummy

		System.out.println("Enter a String: ");
		String s1 = sc.nextLine();

		System.out.println("Number: " + x);
		System.out.println("String: " + s1);

	}

}
