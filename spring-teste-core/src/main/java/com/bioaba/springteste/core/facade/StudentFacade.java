package com.bioaba.springteste.core.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bioaba.springteste.core.facade.base.AbstractCrudFacade;
import com.bioaba.springteste.core.service.StudentService;
import com.bioaba.springteste.persistence.entity.Student;

@Component
@Transactional
public class StudentFacade extends AbstractCrudFacade<Student> {

	@Autowired
	public StudentFacade(StudentService studentService) {
		super(studentService);
	}
	
}
