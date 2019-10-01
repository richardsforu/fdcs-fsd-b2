package com;

public class RunnableDemo extends Employee implements Runnable {

	@Override
	public void run() {

		f1();

	}

	void f1() {
		String tname = Thread.currentThread().getName();

		if (tname.equals("Second Thread")) {
			try {
				System.out.println(tname + " is sleeping");
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname + " is resumed from the sleep");
		}

		for (int i = 1; i <= 5; i++) {
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

		RunnableDemo mt = new RunnableDemo();

		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);

		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.setName("First Thrread");
		t2.setName("Second Thread");

		t1.start();
		t2.start();

	}

}
