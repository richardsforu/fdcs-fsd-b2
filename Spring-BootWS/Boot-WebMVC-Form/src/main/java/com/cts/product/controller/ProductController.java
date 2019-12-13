package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService ps;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("loadForm")
	public String loadProductForm() {
		return "productform";
	}

	@PostMapping("saveProduct")
	public String saveProduct(@RequestParam("productId") int pid, @RequestParam("productName") String pname,
			@RequestParam("price") double price) {
		System.out.println("Product id: " + pid);
		System.out.println("Name: " + pname);
		System.out.println("Price: " + price);
		return "";
	}
	
	// save product
	@PostMapping("saveProductV1")
	public String saveProductV1(@ModelAttribute Product prod) {
		ps.saveProduct(prod);
		return "redirect:listAll";
	}
	
	// List all products
	
	@GetMapping("listAll")
	public String listAll(Model model) {
		
		List<Product> prods=ps.listAll();
		model.addAttribute("products",prods);
		return "display";
	}

	
	
	
	
}
