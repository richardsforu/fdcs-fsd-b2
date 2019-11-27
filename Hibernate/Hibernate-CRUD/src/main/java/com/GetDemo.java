package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class GetDemo {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		Product p = ses.get(Product.class, "P002"); // Eager

		// System.out.println(p.getProdId());
		// System.out.println(p.getProdName());
		// System.out.println(p.getPrice());

		System.out.println("--- Done");

	}

}
