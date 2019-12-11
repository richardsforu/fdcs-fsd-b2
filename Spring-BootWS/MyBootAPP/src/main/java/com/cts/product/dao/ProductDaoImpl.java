package com.cts.product.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {

	@Value("${name}")
	private String prodName;

	public void test() {
		System.out.println("product Name: " + prodName);
		System.out.println("--- test metyhod of ProductDaoImpl");
	}
}
