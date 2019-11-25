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

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(23);

		ses.save(prod);

		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
