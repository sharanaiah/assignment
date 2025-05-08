package com.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void create(Product product) {
		
		productRepository.save(product);
		
	}
	
	public void fetch(Integer id) {
		Optional<Product> optional = productRepository.findById(id);
		if(optional.isPresent()) {
		Product db = optional.get();
		System.out.println(db.getName());
		}
		else {
			 
			throw new RuntimeException("The id is not present in the db");
		}
		
	}
	
	public void update(Product product) {
		productRepository.save(product);
	}
	
    public void delete(Integer id) {
    	productRepository.deleteById(id);
    }
}
