package com.bioaba.springteste.persistence.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bioaba.springteste.persistence.entity.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findAll();
	
}
