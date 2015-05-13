package com.bioaba.springteste.web.controller.base;



import java.util.List;

import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bioaba.springteste.core.facade.base.AbstractCrudFacade;
import com.bioaba.springteste.persistence.entity.base.AbstractEntity;

public abstract class AbstractCrudController<T extends AbstractEntity> {

	protected AbstractCrudFacade<T> facade;
	private Validator validator;
	

	public AbstractCrudController(AbstractCrudFacade<T> facade,
			Validator validator) {
		this.facade = facade;
		this.validator = validator;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// Set @Valid to use
		binder.setValidator(validator);
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<T> list() {
		return facade.list();
	}
}
