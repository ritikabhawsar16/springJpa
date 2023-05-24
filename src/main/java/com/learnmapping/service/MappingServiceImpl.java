  package com.learnmapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learnmapping.model.Address;
import com.learnmapping.model.Student;
import com.learnmapping.repository.MappingRepo;

@Service
public class MappingServiceImpl implements MappingService {
	
	@Autowired
	private MappingRepo repo;

	@Override
	public Student saveStudent(Student s) {
		
		Student student = repo.save(s);
	
		return student;
		
	}

}
