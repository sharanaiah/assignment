package com.product.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.Category;
import com.product.repository.CategoryRepository;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category create(Category category) {
		return categoryRepository.save(category);
		
	}
	
	

}
