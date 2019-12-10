package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService prodService = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setProdId(12);
		prod.setProdName("Laptop");
		prod.setPrice(84674);

		prodService.saveProduct(prod);

		System.out.println("---- Done ---");

	}

}
