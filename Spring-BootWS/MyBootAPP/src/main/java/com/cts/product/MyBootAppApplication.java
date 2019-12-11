package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDaoImpl;

@SpringBootApplication
//@ComponentScan("com.cts")
//@ComponentScans(value = {@ComponentScan(""),@ComponentScan("")})

public class MyBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(MyBootAppApplication.class, args);
		
		ProductDaoImpl prodDao=ac.getBean(ProductDaoImpl.class);
		
		prodDao.test();
		
		
	}

}
