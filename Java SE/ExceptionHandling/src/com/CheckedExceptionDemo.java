package com;

import java.util.Scanner;

public class CheckedExceptionDemo {

	public static void main(String[] args)throws Exception {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a class name: ");

		String clName = sc.next();

		//try {
			Class cl = Class.forName(clName); // dynamically / at run time

			Object obj = cl.newInstance();

			if (obj instanceof Employee) {
				Employee emp =(Employee) obj;
				emp.f12();
			}

			if (obj instanceof Student) {
				Student s = (Student) obj;
				s.f13();
			}

	//	} catch (Exception cnf) {
		//	cnf.printStackTrace();
		//	System.out.println("failed deu to " + cnf);
		//}

		// Employee emp=new Employee(); // at compile time

	}

}
