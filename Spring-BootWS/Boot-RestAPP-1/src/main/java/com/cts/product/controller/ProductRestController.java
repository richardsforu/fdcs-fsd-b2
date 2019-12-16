package com.cts.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;

@RestController
@RequestMapping("api/products")
public class ProductRestController {

	@GetMapping("s1")
	public String f1() {
		return "Welcome to Spring rest API";
	}

	Product prod = null;

	@GetMapping(value = "product")
	public ResponseEntity<?> f2() {
		prod = new Product();
		prod.setProductId(100);
		prod.setProductName("Laptop");
		prod.setPrice(485645);
		if (prod == null) {
			return new ResponseEntity<String>("Product Id is not available", HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Product>(prod, HttpStatus.OK);
	}

	@GetMapping("/myCities")
	public String[] getCities() {
		String[] cities = { "GOA", "Kolkata", "Hyderabad", "Pune" };
		return cities;
	}

	@GetMapping
	public ResponseEntity<?> listAll() {

		Product p1 = new Product(10, "Pen", 144);
		Product p2 = new Product(11, "Book", 5664);
		Product p3 = new Product(12, "Lap", 43344);
		Product p4 = new Product(13, "Note Book", 3444);
		Product p5 = new Product(14, "Mobile", 4444);

		List<Product> prods = new ArrayList<>();
		prods.add(p1);
		prods.add(p2);
		prods.add(p3);
		prods.add(p4);
		prods.add(p5);

		return new ResponseEntity<List<Product>>(prods, HttpStatus.OK);
	}

	@GetMapping("{en}")
	public String getName(@PathVariable("en") String empName) {
		System.out.println("----> " + empName);
		return "UYou have Provided " + empName;
	}
	
	@PostMapping 
	public Product saveProduct(@RequestBody Product prod) {
		
		System.out.println(prod.getProductId());
		System.out.println(prod.getProductName());
		System.out.println(prod.getPrice());
		return prod;
	}

}
