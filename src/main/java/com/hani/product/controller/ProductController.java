package com.hani.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hani.product.Entity.Product;
import com.hani.product.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService ;
	
	private static final Logger log = LoggerFactory.getLogger(ProductController.class) ;
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		log.info("Save Product ... ");
		return productService.saveProduct(product) ;
	}
	
	@GetMapping("/all")
	public List<Product> getProducts() {
		log.info("getProducts Product ... ");
		return productService.getProducts() ;
	}
	
	@GetMapping("/{productId}")
	
	public Product findById(@PathVariable Integer productId) {
		return productService.findProductById(productId) ;
	}
}
