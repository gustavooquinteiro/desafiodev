package desafiodev.model;

import java.util.ArrayList;

public class Curso {

	private String nome;
	private double creditos;
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
	
	
	
}
