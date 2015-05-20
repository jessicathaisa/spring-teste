package com.bioaba.springteste.core.service;


import org.springframework.stereotype.Service;

import com.bioaba.springteste.core.service.base.AbstractCrudService;
import com.bioaba.springteste.persistence.entity.Student;
import com.bioaba.springteste.persistence.repository.IStudentRepository;


@Service
public class StudentService extends AbstractCrudService<Student> {

	protected IStudentRepository iStudentRepository;
	
	/*
	@Inject
	public StudentService(IStudentRepository repository) {
		super(repository);
		this.iStudentRepository = repository;	
	}
	*/
	public StudentService() {
		super(null);
	}

}
