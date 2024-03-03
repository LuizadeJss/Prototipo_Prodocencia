package org.uerjzo.prodocencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uerjzo.prodocencia.model.Pessoa;
import org.uerjzo.prodocencia.repositors.PessoaRepository;

@Service
public class PessoaServices {
	
	@Autowired
	PessoaRepository repository;
	
	public List<Pessoa> encontrarPessoas() {
		
		return repository.findAll();
	}
}
