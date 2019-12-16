package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	Product saveProduct(Product prod);

	List<Product> listAll();

	Product findProductById(int prodId);

	List<Product> findProductsByName(String prodName);

	Product updateProduct(Product prod);

	Product deleteProduct(int prodId);

	Product deleteProduct(Product prod);

}