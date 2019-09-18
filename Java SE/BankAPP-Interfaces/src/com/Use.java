package com;

public class Use {

	public static void main(String[] args) {
		
	
		Customer cust=new Bank();
		cust.deposit();
		cust.withDraw();
		//--------------------------
		BankEmpoyee be=new Bank();
		be.openAccount();
		be.closeAccount();
		//------------------------
		
		Manager m=new Bank();
		m.lockerAccess();
		
		//-----------------
		
		Cleark c=new Bank();
		c.clearkOperations();
		

	}

}
