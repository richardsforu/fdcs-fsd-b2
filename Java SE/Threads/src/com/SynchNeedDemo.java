package com;

public class SynchNeedDemo implements Runnable {

	@Override
	public void run() {

		f1();

	}

	private int amount;

	public SynchNeedDemo(int amount) {
		this.amount = amount;
	}

	synchronized void f1() {

		String tname = Thread.currentThread().getName();

		if (amount >= 5000) {
			System.out.println("Transfering  2000 to " + tname);
			amount = amount - 2000;
		} else {
			System.out.println("Insufficient funds ");
		}

		System.out.println("Available Amount is " + amount);

	}

	public static void main(String[] args) {
		SynchNeedDemo sd = new SynchNeedDemo(5000);

		Thread t1 = new Thread(sd);
		Thread t2 = new Thread(sd);

		t1.setName("James");
		t2.setName("Ozvitha");

		t1.start();
		t2.start();

	}

}
