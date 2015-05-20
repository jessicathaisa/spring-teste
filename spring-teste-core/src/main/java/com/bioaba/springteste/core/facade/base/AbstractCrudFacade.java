package com.bioaba.springteste.core.facade.base;

import java.util.List;

import com.bioaba.springteste.core.service.base.AbstractCrudService;
import com.bioaba.springteste.persistence.entity.base.AbstractEntity;

public abstract class AbstractCrudFacade<T extends AbstractEntity> {
	private AbstractCrudService<T> abstractCrud;
	
	public AbstractCrudFacade(AbstractCrudService<T> abstractCrud){
		this.abstractCrud = abstractCrud;
	}

	public List<T> list() {
		return this.abstractCrud.list();
	}

}
