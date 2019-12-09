package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductDaoImpl prodDao;

	public void saveProduct(Product prod) {
		System.out.println("Service: ");
		prodDao.saveProduct(prod);
	}
}
