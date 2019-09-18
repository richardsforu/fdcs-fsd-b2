package com;

public class Use {

	public static void main(String[] args) {
		
		Bank cust=new Customer();
		
		
		Bank be=new BankEmpoyee();
		be.lockerAccess();
		
		Bank m=new Manager();
		m.openAccount();
		

	}

}
