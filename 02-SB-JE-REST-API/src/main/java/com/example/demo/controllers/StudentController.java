package com.example.demo.controllers;

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

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Student create(@RequestBody Student sudent) {
		return studentService.create(sudent);
		
	}
	
	@GetMapping("/{id}")
	public Student fetch(@PathVariable Integer id) {
		return studentService.fetch(id);
		
	}
	
	@PutMapping("/{studentId}")
	public void update(@RequestBody Student student,@PathVariable Integer studentId) {
		student.setId(studentId);
		studentService.update(student);
		
	}
	
	@DeleteMapping("/{studentId}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer studentId) {
		
		studentService.delete(studentId);
	}

}
