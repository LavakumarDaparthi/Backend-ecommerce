package com.website.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.website.ecommerce.entity.ProductCategory;
import com.website.ecommerce.service.ProductCategoryService;

@Repository
@RequestMapping("productcategory")
public class ProductCategoryController {
	
	@Autowired
	ProductCategoryService pcs;
	
	@GetMapping
	public ResponseEntity<List<ProductCategory>> getCategory(){
		List<ProductCategory> allCategories=pcs.getCategory();
		return new ResponseEntity<List<ProductCategory>>(allCategories, HttpStatus.FOUND);
	}

}
