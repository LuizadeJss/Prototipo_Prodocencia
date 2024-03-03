package org.uerjzo.prodocencia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.uerjzo.prodocencia.data.vo.DepartamentoVO;
import org.uerjzo.prodocencia.model.Departamento;
import org.uerjzo.prodocencia.services.DepartamentoServices;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServices service;

	@GetMapping(value="/todosdepartamentos", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<Departamento> todosDepartamentos(){
		return service.encontrarDepartamentos();
	}
	
	@PostMapping(value = "/novodepartamento", produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes= MediaType.APPLICATION_JSON_VALUE)
	public DepartamentoVO criarDepartamento(@RequestBody DepartamentoVO departamento) {
		return service.novoDepartamento(departamento);
	}
}
