package desafiodev.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
@Entity
public class Aluno extends Usuario{

	private static final long serialVersionUID = 1L;

	
	@ManyToMany 
	private ArrayList<Disciplina> disciplinas;
	
	@ManyToMany
	private ArrayList<Disciplina> alternativas;
	
	@Column
	private double valorASerPago;
	
	
	
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	public ArrayList<Disciplina> getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(ArrayList<Disciplina> alternativas) {
		this.alternativas = alternativas;
	}
	public double getValorASerPago() {
		this.setValorASerPago();
		return valorASerPago;
	}
	public void setValorASerPago() {
		this.valorASerPago = 0.0;
		for (Disciplina d: disciplinas) {
			this.valorASerPago += d.getValor();
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alternativas == null) ? 0 : alternativas.hashCode());
		result = prime * result + ((disciplinas == null) ? 0 : disciplinas.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valorASerPago);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Aluno other = (Aluno) obj;
		if (alternativas == null) {
			if (other.alternativas != null)
				return false;
		} else if (!alternativas.equals(other.alternativas))
			return false;
		if (disciplinas == null) {
			if (other.disciplinas != null)
				return false;
		} else if (!disciplinas.equals(other.disciplinas))
			return false;
		if (Double.doubleToLongBits(valorASerPago) != Double.doubleToLongBits(other.valorASerPago))
			return false;
		return true;
	}
	
	

}
