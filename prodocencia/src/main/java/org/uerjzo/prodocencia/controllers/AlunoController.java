package org.uerjzo.prodocencia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uerjzo.prodocencia.model.Aluno;
import org.uerjzo.prodocencia.services.AlunoServices;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoServices service;
	
	@GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Aluno encontrarAlunoPorMatricula(@PathVariable(value = "id")String id) 
		throws Exception
	{
		return service.findByMatricula(id);
	}
}
