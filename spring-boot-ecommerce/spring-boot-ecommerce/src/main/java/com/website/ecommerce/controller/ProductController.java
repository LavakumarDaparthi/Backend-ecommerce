package com.website.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.website.ecommerce.entity.Product;
import com.website.ecommerce.service.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@GetMapping
	public ResponseEntity<List<Product>> getProduct(){
		List<Product> allproducts=productservice.getProduct();
		return new ResponseEntity<List<Product>>(allproducts, HttpStatus.FOUND);
	}
}
