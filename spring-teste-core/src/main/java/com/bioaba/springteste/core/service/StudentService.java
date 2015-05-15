package com.bioaba.springteste.core.service;


import org.springframework.stereotype.Service;

import com.bioaba.springteste.core.service.base.AbstractCrudService;
import com.bioaba.springteste.persistence.entity.Student;
import com.bioaba.springteste.persistence.repository.IStudentRepository;


@Service
public class StudentService extends AbstractCrudService<Student> {

	protected IStudentRepository iStudentRepository;
	
//	@Inject
	public StudentService() {
		super(null);
//		this.iStudentRepository = repository;	
	}

    @Override
    protected void checkIfValid(Student entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void checkBussinessKey(Student entity) {
        // TODO Auto-generated method stub
        
    }
	
	

}
