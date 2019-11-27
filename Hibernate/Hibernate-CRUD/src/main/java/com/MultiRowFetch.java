package com;

import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;

import com.cts.product.config.DBConfig;
import com.cts.product.entity.Employee;
import com.cts.product.entity.Product;

public class MultiRowFetch {

	public static void main(String[] args) {

		Session ses = DBConfig.getSessionFactory().openSession();

		MultiIdentifierLoadAccess<Product> products = ses.byMultipleIds(Product.class);

		List<Product> prods= products.multiLoad("P001","P002","P005");
		
		for(Product prod:prods) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("---------------------");
		}
		
		

		System.out.println("--- Done");

	}

}
