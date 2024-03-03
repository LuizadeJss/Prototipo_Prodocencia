package org.uerjzo.prodocencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uerjzo.prodocencia.model.Pessoa;
import org.uerjzo.prodocencia.services.PessoaServices;

@RestController
@RequestMapping("/pessoas")
public class PessoaContoller {

	@Autowired
	PessoaServices service;
	
	@GetMapping(produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Pessoa> todasPessoas(){
		
		return service.encontrarPessoas();
	}
}
