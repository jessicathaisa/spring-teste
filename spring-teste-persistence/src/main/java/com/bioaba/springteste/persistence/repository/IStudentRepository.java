package com.bioaba.springteste.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bioaba.springteste.persistence.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

	public Student findByName(String name);
	
}
