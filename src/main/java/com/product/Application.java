package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.entity.Product;
import com.product.service.ProductService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private ProductService productService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Product product = new Product();
//		product.setName("AC");
//		product.setBrand("Godrej");
//		productService.create(product);
		
	//	productService.fetch(1);
		
//		Product product = new Product();
//		//product.setId(2);
//		product.setName("AC-u1");
//		product.setBrand("Godrej-u1");
//    	productService.update(product);
		
		productService.delete(1);
	}
	
	
	

}
