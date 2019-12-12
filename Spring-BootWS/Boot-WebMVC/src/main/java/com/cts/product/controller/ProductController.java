package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Controller
public class ProductController {
	
	@Autowired
	private ProductDao prodDao;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/s1")
	public void f1() {
		System.out.println("--- f1 method of ProductController...");
	}
	
	@RequestMapping("s2")
	public String f2() {
		System.out.println("--- f2 method of ProductController...");
		return "one";
	}
	
	@RequestMapping(value = "s3")
	public String f3(Model data) {
		String empName="Ozvitha";
		data.addAttribute("ename",empName);
		return "two";
	}
	
	@RequestMapping(value = "s4")
	public String f4(Model data) {
		String cities[]= {"Hyderabad","Chennai","Pune","Bangalore","Kolkata"};
		data.addAttribute("myCities",cities);
		return "thr";
	}
	
	@RequestMapping(value = "s5")
	public ModelAndView f5() {
		
		ModelAndView mav=new  ModelAndView();
		List<Product> prods=prodDao.findAll();
		
		mav.setViewName("display");
		mav.addObject("products",prods);
		
		return mav;
	}
	

}
