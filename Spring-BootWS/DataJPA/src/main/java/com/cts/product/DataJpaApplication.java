package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext ac=SpringApplication.run(DataJpaApplication.class, args);
	
		ProductDao prodDao=ac.getBean(ProductDao.class);
		
		Product prod=new Product();
		prod.setProductId(100);
		prod.setProductName("Laptop");
		prod.setPrice(386435);
		
		prodDao.save(prod);
		
		
		
		
	}

}
