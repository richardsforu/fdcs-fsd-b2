package com;

import java.io.File;

public class Test {

	public static void main(String[] args) {

		System.out.println("-- Stated");

		try {

			int i, j;
			i = 10;
			j = 0;

			int num[] = new int[1];

			Test t = null;
			System.out.println(t.hashCode());

			num[5] = 100;

			int x = i / j;

			System.out.println("X: " + x);

		}

		catch (ArithmeticException e) {
			System.out.println("Failed due to " + e);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println("failed due to " + ae);
		} catch (Exception me) {
			System.out.println("Failed due to " + me);
		}

		System.out.println("-- Operations");
		System.out.println("-- Completed");

	}

}
