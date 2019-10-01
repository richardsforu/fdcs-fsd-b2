package com;

public class Test {

	static void f1() {
		System.out.println("f1 -- " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		System.out.println("main -- " + Thread.currentThread().getName());
		f1();
	}

}
