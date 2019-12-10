package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class Test2 {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

	
		ProductService prodService = ac.getBean(ProductService.class);
		
		for(Product prod:prodService.displayAll()) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("----------------------");
		}
		
		
		
		

	}

}
