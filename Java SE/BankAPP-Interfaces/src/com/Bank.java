package com;

public class Bank implements Customer, BankEmpoyee, Manager, Cleark {

	@Override
	public void clearkOperations() {
		System.out.println("-- Cleark operation");
	}

	public void withDraw() {
		System.out.println("Withdrawing");
	}

	public void deposit() {
		System.out.println("Depositing");
	}

	public void openAccount() {
		System.out.println("Opening Account");
	}

	public void closeAccount() {
		System.out.println("CLosing Account");
	}

	public void lockerAccess() {
		System.out.println("Locker Acess has given");
	}

}
