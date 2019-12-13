package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void saveProduct(Product prod);

	List<Product> listAll();

	Product findProductById(int productId);

	void deleteProductById(int productId);

	void deleteProductByObject(Product prod);

}