package com.learnmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnmapping.model.Student;

@Repository
public interface MappingRepo extends JpaRepository<Student, Integer>
{

}
