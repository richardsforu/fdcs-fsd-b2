package com.cts.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductRestController {

	@GetMapping
	public String securityTest() {
		return "You are valid user";
	}
}
