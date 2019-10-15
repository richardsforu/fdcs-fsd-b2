package com;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerDemo {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.setEmpId(10);
		emp.setEmpName("James");
		emp.setSalary(84838);

		try {

			FileOutputStream fos = new FileOutputStream("src/emp.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(emp);

			System.out.println("--- Ser is Done");

		} catch (Exception e) {
			System.out.println("-- Failed due to " + e);
		}

	}

}
