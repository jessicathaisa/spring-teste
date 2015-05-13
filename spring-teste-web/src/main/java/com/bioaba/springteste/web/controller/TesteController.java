package com.bioaba.springteste.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bioaba.springteste.web.domain.Teste;

@Controller
@RequestMapping("/teste")
public class TesteController {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Teste find(@PathVariable("id") long id) {
		List<String> lista = new ArrayList();

		System.out.print("Teste!");
		
		lista.add("Jessica");
		lista.add("Leticia");
		lista.add("Lívia");
		lista.add("Juliana");
		lista.add("Amanda");
		
		return new Teste(lista);
	}
	
}