package com.cts.product.config;

import java.util.HashMap;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.cts.product.entity.Actor;
import com.cts.product.entity.Film;


public class DBConfig {

	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();

		Properties props = new Properties();
		try {

			//props.load(new FileInputStream("db.properties"));
			 props.load(ClassLoader.getSystemClassLoader().getResourceAsStream("db.properties"));
			HashMap<String, String> settings = new HashMap<String, String>();
			settings.put(Environment.DRIVER, props.getProperty("mysql.driver"));
			settings.put(Environment.URL, props.getProperty("mysql.url"));
			settings.put(Environment.USER, props.getProperty("mysql.user"));
			settings.put(Environment.PASS, props.getProperty("mysql.password"));
			settings.put(Environment.DIALECT, props.getProperty("mysql.dialect"));
			// -----------------
			settings.put(Environment.SHOW_SQL, props.getProperty("show.sql"));
			settings.put(Environment.FORMAT_SQL, props.getProperty("format.sql"));
			settings.put(Environment.HBM2DDL_AUTO, props.getProperty("hbm2ddl.auto"));

			registryBuilder.applySettings(settings);

			registry = registryBuilder.build();

			MetadataSources metadataSources = new MetadataSources(registry);
			// mappings
			metadataSources.addAnnotatedClass(Actor.class);
			metadataSources.addAnnotatedClass(Film.class);
			Metadata metadata = metadataSources.getMetadataBuilder().build();
			sessionFactory = metadata.buildSessionFactory();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return sessionFactory;
	}

}
