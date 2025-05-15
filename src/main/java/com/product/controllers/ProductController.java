package com.product.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.Product;
import com.product.service.ProductService;



@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product create(@RequestBody Product product) {
		return productService.create(product);
		
	}
	
	@GetMapping("/{id}")
	public Product fetch(@PathVariable Integer id) {
		return productService.fetch(id);
		
	}
	
	@PutMapping("/{productId}")
	public void update( @RequestBody Product product,@PathVariable Integer productId) {
		product.setId(productId);
		productService.update(product);
		
	}
	
	@DeleteMapping("/{productId}")
	public void delete( @PathVariable Integer productId) {
		productService.delete(productId);
		
		
	}

}
