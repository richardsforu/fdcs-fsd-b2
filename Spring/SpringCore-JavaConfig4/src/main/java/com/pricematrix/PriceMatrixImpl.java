package com.pricematrix;

import org.springframework.stereotype.Repository;

//Dependency
@Repository
public class PriceMatrixImpl {

	public PriceMatrixImpl() {
		System.out.println("--- PriceMatricImpl Object created...");
	}

	public double getItemPrice(String itemCode) {
		// DB code to fetch itemPrice from table

		return 100.00;

	}

}
