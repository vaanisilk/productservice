package com.hani.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hani.product.Entity.Product;

@Repository
public interface ProductRepository extends  JpaRepository<Product, Integer>{
	
	public Product findByProductId(Integer productId) ;

}
