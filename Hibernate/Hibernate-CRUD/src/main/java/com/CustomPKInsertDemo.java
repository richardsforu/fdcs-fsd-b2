package com;

import java.time.LocalDate;

import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Item;
import com.cts.product.entity.Order;
import com.cts.product.entity.Product;

public class CustomPKInsertDemo {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		// ---------------------------------

		Order o=new Order();
		o.setQuantity(10);
		o.setOrderDate(LocalDate.now());

		ses.save(o);
		
		//System.out.println("PK: "+o.getOrderId());

		ses.beginTransaction().commit();

		System.out.println("---- Done ");

	}

}
