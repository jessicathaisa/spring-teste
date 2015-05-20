package com.bioaba.springteste.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.bioaba.springteste.persistence.entity.base.AbstractEntity;

@Entity
@Table(name = "student")
public class Student extends AbstractEntity{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return getId() + " " + getName();
	}
}
