package com;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class UpdateDemo {

	public static void main(String[] args) {

		Session ses=DBConfig.getSessionFactory().openSession();
	
		
		// ---------------------------------

		
		Product prod=new Product();
		prod.setProdId("P006");
		prod.setProdName("LCD Monitor");
		prod.setPrice(121212);
		
		ses.update(prod);
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
