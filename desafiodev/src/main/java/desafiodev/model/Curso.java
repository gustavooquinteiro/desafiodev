package desafiodev.model;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String nome;
	@Column
	private double creditos;
	@OneToMany(mappedBy = "curso", targetEntity = Disciplina.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL) 
	private ArrayList<Disciplina> disciplinas;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCreditos() {
		return creditos;
	}
	public void setCreditos(double creditos) {
		this.creditos = creditos;
	}
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(creditos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (Double.doubleToLongBits(creditos) != Double.doubleToLongBits(other.creditos))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
	
}
