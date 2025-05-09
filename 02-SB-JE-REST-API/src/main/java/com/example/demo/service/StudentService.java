package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public Student create(Student student) {
		 return studentRepository.save(student);
		}
	public Student fetch(Integer Id) {
		     Optional<Student> optional = studentRepository.findById(Id);
		     if(optional.isPresent()) {
		    	  Student dbStudent = optional.get();
		    	  System.out.println(dbStudent.getName());
		    	  return dbStudent;
		     }
		     else {
		    	 throw new RuntimeException("Student Id not found");
		    	 
		     }
	}
	
	public void update(Student student) {
		
    Student dbStudent = fetch(student.getId());
    dbStudent.setEmail(student.getEmail());
    dbStudent.setName(student.getName());
		studentRepository.save(student);
	}
	
	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}

}
