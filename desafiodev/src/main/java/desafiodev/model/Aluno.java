package desafiodev.model;

import java.util.ArrayList;

public class Aluno extends Usuario{
	
	private String nome;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<Disciplina> alternativas;
	private double valorASerPago;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
		return valorASerPago;
	}
	public void setValorASerPago(double valorASerPago) {
		this.valorASerPago = valorASerPago;
	}
	
	

}
