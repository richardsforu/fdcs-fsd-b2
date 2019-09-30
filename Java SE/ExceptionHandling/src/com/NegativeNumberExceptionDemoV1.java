package com;

public class NegativeNumberExceptionDemoV1 {

	public static void main(String[] args) throws Exception {

		System.out.println("--- start");
		// ---
		// ----
		int x = -100;

		if (x <= 0) {
			System.out.println("Invalid Number");

			try {

				throw new InvalidOperationDetectedException("Invalid operation detected...");

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("Valid Number");
		}

		// ----
		// ----

		System.out.println("--- closing ops");

	}

}
