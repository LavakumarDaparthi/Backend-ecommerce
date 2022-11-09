package com.website.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.website.ecommerce.dao.ProductRepository;
import com.website.ecommerce.entity.Product;

@Service
public  class ProductService{
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getProduct(){
		return (List<Product>) productRepository.findAll();
	}

}
