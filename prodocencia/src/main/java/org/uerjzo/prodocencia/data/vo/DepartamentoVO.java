package org.uerjzo.prodocencia.data.vo;

import java.io.Serializable;
import java.util.Objects;

public class DepartamentoVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int idDepartamento;
	
	private String nome;
	
	private String diretor;
	
	public DepartamentoVO(){}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(diretor, idDepartamento, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DepartamentoVO other = (DepartamentoVO) obj;
		return Objects.equals(diretor, other.diretor) && idDepartamento == other.idDepartamento
				&& Objects.equals(nome, other.nome);
	}
	
	
}
