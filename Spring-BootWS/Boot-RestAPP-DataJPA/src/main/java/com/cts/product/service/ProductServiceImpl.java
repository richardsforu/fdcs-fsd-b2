package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.controller.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public Product saveProduct(Product prod) {
		return prodDao.save(prod);
	}

	@Override
	public List<Product> listAll() {
		return prodDao.findAll();
	}

	@Override
	public Product findProductById(int prodId) {
		return prodDao.findById(prodId).orElse(null);
	}

	@Override
	public List<Product> findProductsByName(String prodName) {
		return prodDao.findProductByProductNameLike(prodName);
	}

	@Override
	public Product updateProduct(Product prod) {
		System.out.println("--- DAO: " + prod.getProductName());
		return prodDao.save(prod);
	}

	@Override
	public Product deleteProduct(int prodId) {

		Product prod = findProductById(prodId);
		if (prod != null) {
			prodDao.deleteById(prodId);
		}
		return prod;
	}

	@Override
	public Product deleteProduct(Product prod) {
		Product product = findProductById(prod.getProductId());
		if (product != null)
			prodDao.delete(prod);
		return product;
	}

}
