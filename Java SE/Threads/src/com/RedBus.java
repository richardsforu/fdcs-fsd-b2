package com;

class BusOperator implements Runnable {
	private int noOfSeats = 1;
	private int wanted;

	public BusOperator(int wanted) {

		this.wanted = wanted;
	}

	@Override
	public void run() {
		bookTicket();
	}

	public void bookTicket() {

		String tname = Thread.currentThread().getName();

		System.out.println("Number of Seats availble " + noOfSeats);
		System.out.println("trying to book " + wanted + " seats to " + tname);

		synchronized (this) {
			if (noOfSeats >= wanted) {

				noOfSeats = noOfSeats - wanted;
				System.out.println("Booked " + wanted + " seats to " + tname);

			} else {
				System.out.println("Sorry. No Seats Avialble");
			}
		}

	}

}

public class RedBus {
	public static void main(String[] args) {

		BusOperator bwtc = new BusOperator(1);

		Thread p1 = new Thread(bwtc);
		Thread p2 = new Thread(bwtc);

		p1.setName("Praveen");
		p2.setName("James");

		p1.start();
		p2.start();

	}

}
