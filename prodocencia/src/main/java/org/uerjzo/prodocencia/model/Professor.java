package org.uerjzo.prodocencia.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="professor")
public class Professor extends Pessoa{

	private static final long serialVersionUID = 1L;
	
	public Professor(){}
	
	@Column(name="matricula_professor")
	private String matricula;
	
	@Column(name="id_departamento")
	private int idDepartamento;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idDepartamento, matricula);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		return idDepartamento == other.idDepartamento && Objects.equals(matricula, other.matricula);
	}
	
	

}
