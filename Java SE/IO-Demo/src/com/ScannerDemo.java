package com;

import java.io.File;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		try {

			File file = new File("src/abc.txt");
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			

		} catch (Exception e) {
			System.out.println("-- failed due to " + e);
		}

	}

}
