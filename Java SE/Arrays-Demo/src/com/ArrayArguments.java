package com;

public class ArrayArguments {

	public static void test(int[] temp) {

		System.out.println("in the test method");

		for (int i = 0; i < temp.length; i++) {
			temp[i] = temp[i] + 100;
			System.out.println(temp[i]);
		}
	}

	public static void main(String[] args) {

		int[] nums = { 10, 20, 30, 40, 50 };

		System.out.println("Before method");

		for (int n : nums) {
			System.out.println(n);
		}

		System.out.println("-----------------");

		test(nums);

		System.out.println("After method");

		for (int n : nums) {
			System.out.println(n);
		}

	}

}
