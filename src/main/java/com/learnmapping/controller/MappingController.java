package com.learnmapping.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnmapping.model.Address;
import com.learnmapping.model.Student;
import com.learnmapping.service.MappingService;

@RestController
public class MappingController {
	
	@Autowired
	private MappingService service;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudentWithInfo(){   //TO GET STATUS CODE ,header & body
		
		Address addr1 = new Address("Sukhliya, Electronic Complex, 452010");
		
		Student s = new Student("Jyoti", addr1);
		service.saveStudent(s);
		 
		return new ResponseEntity<Student>(s, HttpStatus.CREATED);
	}

}
