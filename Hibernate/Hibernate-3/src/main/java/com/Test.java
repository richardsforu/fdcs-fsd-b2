package com;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		Session ses=DBConfig.getSessionFactory().openSession();
	
		
		// ---------------------------------

		Product prod1 = new Product();
		prod1.setProdId("P003");
		prod1.setProdName("Book3");
		prod1.setPrice(23);

		
		Product prod2 = new Product();
		prod2.setProdId("P005");
		prod2.setProdName("Book5");
		prod2.setPrice(23);
		
		Product prod3 = new Product();
		prod3.setProdId("P003");
		prod3.setProdName("Book3");
		prod3.setPrice(34);
		
		ses.save(prod1);
		
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
