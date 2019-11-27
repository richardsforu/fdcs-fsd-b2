package com;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class SaveDemo {

	public static void main(String[] args) {

		Session ses=DBConfig.getSessionFactory().openSession();
	
		
		// ---------------------------------

		
		Product prod=new Product();
		prod.setProdId("P005");
		prod.setProdName("Mouse");
		prod.setPrice(5432);
		
		ses.save(prod);
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

	
}
