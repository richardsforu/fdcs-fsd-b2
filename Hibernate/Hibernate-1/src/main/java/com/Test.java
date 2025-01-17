package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory sf = cfg.buildSessionFactory();

		Session ses = sf.openSession();

		// ---------------------------------

		Product prod1 = new Product();
		prod1.setProdId("P004");
		prod1.setProdName("Book1");
		prod1.setPrice(23);

		
		Product prod2 = new Product();
		prod2.setProdId("P005");
		prod2.setProdName("Bo0k2");
		prod2.setPrice(23);
		
		Product prod3 = new Product();
		prod3.setProdId("P006");
		prod3.setProdName("Book3");
		prod3.setPrice(23);
		
		ses.save(prod1);
		ses.save(prod2);
		ses.save(prod3);
		
		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
