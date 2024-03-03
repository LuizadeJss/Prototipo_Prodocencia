package org.uerjzo.prodocencia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uerjzo.prodocencia.data.vo.DepartamentoVO;
import org.uerjzo.prodocencia.mapper.DozerMapper;
import org.uerjzo.prodocencia.model.Departamento;
import org.uerjzo.prodocencia.repositors.DepartamentoRepository;

@Service
public class DepartamentoServices {
	
	@Autowired
	DepartamentoRepository repository;
	
	public List<Departamento> encontrarDepartamentos() {
		return repository.findAll();
	}
	
	public DepartamentoVO novoDepartamento(DepartamentoVO departamento) {
		
		var entity = DozerMapper.parseObject(departamento, Departamento.class);
		var vo = DozerMapper.parseObject(repository.save(entity), DepartamentoVO.class);
		return vo;
	}
}
