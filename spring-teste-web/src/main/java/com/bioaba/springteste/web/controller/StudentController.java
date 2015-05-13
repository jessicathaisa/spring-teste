package com.bioaba.springteste.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bioaba.springteste.core.facade.StudentFacade;
import com.bioaba.springteste.persistence.entity.Student;
import com.bioaba.springteste.web.controller.base.AbstractCrudController;
import com.bioaba.springteste.web.domain.Teste;
import com.bioaba.springteste.web.validation.StudentValidator;

@ControllerAdvice
@RequestMapping("/student")
public class StudentController extends AbstractCrudController<Student>{

	@Inject
	public StudentController(StudentFacade facade, StudentValidator validator){
		super(facade, validator);
	}
	
}
