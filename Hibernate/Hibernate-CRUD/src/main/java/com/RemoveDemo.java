package com;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class RemoveDemo {

	public static void main(String[] args) {

		Session ses=DBConfig.getSessionFactory().openSession();
	
		
		// ---------------------------------

		
		Product prod=new Product();
		prod.setProdId("P007");
		prod.setProdName("Mouse");
		prod.setPrice(5432);
		
		Product prod1=new Product();
		prod1.setProdId("P008");
		prod1.setProdName("Mouse");
		prod1.setPrice(5432);
		
		Product prod2=new Product();
		prod2.setProdId("P009");
		prod2.setProdName("Mouse");
		prod2.setPrice(5432);
		
		ses.save(prod);
		ses.save(prod1);
		ses.save(prod2);
		
		ses.remove(prod2);
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
