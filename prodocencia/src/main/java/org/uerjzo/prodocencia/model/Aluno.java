package org.uerjzo.prodocencia.model;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String matricula;
	private String senha;
	
	public Aluno(){}//jpa exige esse construtor

	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(matricula, senha);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(matricula, other.matricula) && Objects.equals(senha, other.senha);
	}
	
}
