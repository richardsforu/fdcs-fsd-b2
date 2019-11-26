package com;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

public class Test2 {

	public static void main(String[] args) {

		StandardServiceRegistry registry=null;
		SessionFactory sessionFactory=null;
		
		StandardServiceRegistryBuilder registryBuilder=new StandardServiceRegistryBuilder();
		
		
		HashMap<String, String> settings=new HashMap<String, String>();
		
		settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		settings.put(Environment.URL,"jdbc:mysql://localhost:3306/test2");
		settings.put(Environment.USER, "root");
		settings.put(Environment.PASS, "root1234");
		settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		//-----------------
		settings.put(Environment.SHOW_SQL, "true");
		settings.put(Environment.FORMAT_SQL, "true");
		settings.put(Environment.HBM2DDL_AUTO, "update");
		
		registryBuilder.applySettings(settings);
		
		registry=registryBuilder.build();
		
		MetadataSources metadataSources=new MetadataSources(registry);
		// mappings
		metadataSources.addAnnotatedClass(Product.class);
		Metadata metadata=metadataSources.getMetadataBuilder().build();
		sessionFactory=metadata.buildSessionFactory();
		
		Session ses1=sessionFactory.openSession();
		Session ses2=sessionFactory.openSession();
		Session ses3=sessionFactory.openSession();
		
		Transaction book1Txn=ses1.beginTransaction();
		Transaction book2Txn=ses2.beginTransaction();
		Transaction book3Txn=ses3.beginTransaction();
	
		
		// ---------------------------------

		Product prod1 = new Product();
		prod1.setProdId("P004");
		prod1.setProdName("Book4");
		prod1.setPrice(232);

		
		Product prod2 = new Product();
		prod2.setProdId("P005");
		prod2.setProdName("Book5");
		prod2.setPrice(23);
		
		Product prod3 = new Product();
		prod3.setProdId("P003");
		prod3.setProdName("Book3");
		prod3.setPrice(34);
		
		ses1.save(prod1);
		ses2.save(prod2);
		ses3.save(prod3);
		
		book1Txn.commit();
		book2Txn.commit();
		book3Txn.commit();
		//ses1.beginTransaction().commit();
		//ses2.beginTransaction().commit();
		//ses3.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
