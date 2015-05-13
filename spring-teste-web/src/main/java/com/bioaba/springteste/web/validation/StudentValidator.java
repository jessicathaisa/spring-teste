package com.bioaba.springteste.web.validation;

import org.springframework.validation.Validator;

import com.bioaba.springteste.persistence.entity.Student;
import com.bioaba.springteste.web.validation.base.AbstractValidator;


public class StudentValidator extends AbstractValidator<Student> implements Validator{

	public StudentValidator() {
		super(Student.class);
	}

	@Override
	protected void validate(Student entity) {

		super.Required("name");
		
	}
}
