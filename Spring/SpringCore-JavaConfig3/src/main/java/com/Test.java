package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setSalary(54);

		ProductServiceImpl prodService = ac.getBean(ProductServiceImpl.class);
		prodService.saveProduct(prod);

	}

}
