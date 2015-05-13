package com.bioaba.springteste.web.domain;

import java.util.List;

public class Teste {
	private List<String> lista;

	public Teste(List<String> l){
		this.lista = l;
	}
	
	public List<String> getLista() {
		return lista;
	}

	public void setLista(List<String> lista) {
		this.lista = lista;
	}
}
