package com;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Item;
import com.cts.product.entity.Product;

public class AutoPrimarykeyGen {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		// ---------------------------------

		Item item = new Item();
		item.setItemName("Book");
		item.setQuantity(10);

		ses.save(item);

		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
