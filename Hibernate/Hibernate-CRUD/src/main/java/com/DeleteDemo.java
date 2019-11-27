package com;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class DeleteDemo {

	public static void main(String[] args) {

		Session ses=DBConfig.getSessionFactory().openSession();
	
		
		// ---------------------------------

		
		Product prod=new Product();
		
		prod.setProdId("P0068");
		
		
		ses.delete(prod);
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
