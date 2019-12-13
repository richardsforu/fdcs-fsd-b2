package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao prodDao;
	
	
	@Override
	public void saveProduct(Product prod) {
		prodDao.save(prod);
	}
	
	@Override
	public List<Product> listAll(){
		return prodDao.findAll();
	}
	
	@Override
	public Product findProductById(int productId) {
		return prodDao.findById(productId).orElse(null);
	}
	
	@Override
	public void deleteProductById(int productId) {
		prodDao.deleteById(productId);
	}
	
	@Override
	public void deleteProductByObject(Product prod) {
		prodDao.delete(prod);
	}

}
