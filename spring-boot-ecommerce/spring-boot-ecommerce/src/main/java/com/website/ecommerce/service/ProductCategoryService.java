package com.website.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductCategoryRepository;
import com.website.ecommerce.entity.ProductCategory;

@Service
public class ProductCategoryService {
	
	@Autowired
	ProductCategoryRepository productCategory;
	
	public List<ProductCategory> getCategory(){
		return productCategory.findAll();
	}
	

}
