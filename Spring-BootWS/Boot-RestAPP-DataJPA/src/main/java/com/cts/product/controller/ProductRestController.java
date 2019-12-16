package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("api/products")
public class ProductRestController {
	
	@Autowired
	private ProductService ps;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product prod) {
		return ps.saveProduct(prod);
	}
	
	@GetMapping
	public List<Product> listAll(){
		return ps.listAll();
	}
	
	
	@GetMapping("/{pid}")
	public Product findProduct(@PathVariable("pid")int productId) {
		return ps.findProductById(productId);
	}
	
	@GetMapping("byName/{pname}")
	public ResponseEntity<?> findByName(@PathVariable("pname")String pn){
		
		List<Product> prods=ps.findProductsByName("%"+pn+"%");
		
		if(prods.size()!=0) {
			return new ResponseEntity<List<Product>>(prods,HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("No Products foudn with "+pn,HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
	public ResponseEntity<?> updateProduct(@RequestBody Product prod) {
		Product oldProdObj=ps.findProductById(prod.getProductId());
		if(oldProdObj!=null) {
			System.out.println(oldProdObj.getProductId());
			return new ResponseEntity<Product>(ps.updateProduct(prod),HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product Id with "+prod.getProductId()+" does not found in DB",HttpStatus.BAD_REQUEST);
	}
	
	
	@DeleteMapping("/{pid}")
	public ResponseEntity<?> deleteProduct(@PathVariable("pid") int pid){
		if(ps.findProductById(pid)!=null) {
			return new ResponseEntity<Product>(ps.deleteProduct(pid),HttpStatus.OK);
		}
		
		return new ResponseEntity<String>("Product Id "+pid+" Not found in Database",HttpStatus.BAD_REQUEST);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteProduct(@RequestBody Product prod){
		if(ps.findProductById(prod.getProductId())!=null) {
			return new ResponseEntity<Product>(ps.deleteProduct(prod),HttpStatus.OK);
		}
		return new ResponseEntity<String>("Product Id "+prod.getProductId()+" Not found in Database",HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	
	
	
	

}
