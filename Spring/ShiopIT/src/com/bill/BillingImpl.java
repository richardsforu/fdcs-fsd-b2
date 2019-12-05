package com.bill;

import com.pricematrix.PriceMatrixImpl;

// Dependent

public class BillingImpl {
	
	/*
	 * Issues
	 * ------------
	 * 	-> Too many dependency objects creations
	 * 		-> perf of apploication goes down
	 * 
	 *  why this issue happened?
	 *  -----------------------------
	 *  -> Dependent class itself creating dependency class object
	 *  
	 *  What is the solution?
	 *  ------------------------
	 *  -> Do not create Dependency obj in the Dependent class.
	 *  -> Use JNDI technique to find objects. (Java Naming Directory interface)
	 *  	- -> JNDI location is tightly binded with dependenct classes
	 *  
	 *   What is the Best solution?
	 *   -----------------------------
	 *   
	 *   -> Do not create, do not find, instead ask some one => IoC (Inversion of Controll)
	 *   
	 *   DI -> Dependency Injection -> Injecting Dependency obj to the dependent
	 *   
	 *    2 ways
	 *    -> setter based injection
	 *    -> constructor based injection
	 *  
	 * 
	 * 
	 * 
	 */
	
	
	PriceMatrixImpl price;
	
	

	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}



	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);

		}

		return total;
	}

}
