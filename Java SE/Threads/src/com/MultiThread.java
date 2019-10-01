package com;

public class MultiThread extends Thread {

	@Override
	public void run() {
		f1();
		//f2();
	}

	void f1() {
		String tname = Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println("I =" + i + " By " + tname);
		}
	}

	void f2() {
		String tname = Thread.currentThread().getName();
		for (int j = 1; j <= 10; j++) {
			System.out.println("J =" + j + " By " + tname);
		}
	}

	public static void main(String[] args) {

		MultiThread mt = new MultiThread();

		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);

		t1.setName("First Thrread");
		t2.setName("Second Thread");

		t1.start();
		t2.start();

	}

}
