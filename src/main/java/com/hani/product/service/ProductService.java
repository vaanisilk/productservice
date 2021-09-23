package com.hani.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.hani.product.Entity.Product;
import com.hani.product.repository.ProductRepository;

@Service

public class ProductService {

	@Autowired
	ProductRepository productRepository ;
	
	public Product saveProduct (Product product) {
		return productRepository.save(product) ;
	}
	
	public Product findProductById(Integer productId) {
		return productRepository.findByProductId(productId) ;
	}
	
	public List<Product> getProducts() {
		return productRepository.findAll() ;
	}
}
