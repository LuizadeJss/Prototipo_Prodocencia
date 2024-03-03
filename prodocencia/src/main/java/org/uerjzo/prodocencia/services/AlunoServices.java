package org.uerjzo.prodocencia.services;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;
import org.uerjzo.prodocencia.model.Aluno;

@Service
public class AlunoServices {
	
	private Logger logger = Logger.getLogger(AlunoServices.class.getName());

	public Aluno findByMatricula(String matricula) {
		
		logger.info("Encontrando o Aluno");
		
		Aluno aluno = new Aluno();
		

		aluno.setMatricula("1");
		//aluno.setPrimeiroAcesso(true);
		aluno.setSenha("qqcoisa");
		
		return aluno;
	}
}
