package desafiodev.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import desafiodev.model.Disciplina;
import desafiodev.service.PesquisaDisciplinaService;

@Named
@ViewScoped
public class PesquisaDisciplinasBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PesquisaDisciplinaService pds;
	
	private String nome;
	private List<Disciplina> materiasOfertadas;
	private Disciplina materiaEscolhida;
	private double valor;
	
	public double getValor() {
		this.setValor();
		return valor;
	}

	public void setValor() {
		this.valor = 0.0;
		for (Disciplina d: materiasOfertadas) {
			this.valor += d.getValor();
		}
	}

	public PesquisaDisciplinasBean() {
		setMateriasOfertadas(new ArrayList<>());
	}
	
	public void pesquisarCurso() {
		setMateriasOfertadas(pds.pesquisarCurso(nome));
	}
	public void pesquisarAluno() {
		setMateriasOfertadas(pds.pesquisarAluno(nome));
	}
	
	public Disciplina getMateriaEscolhida() {
		return materiaEscolhida;
	}

	public void setMateriaEscolhida(Disciplina materiaEscolhida) {
		this.materiaEscolhida = materiaEscolhida;
	}

	public List<Disciplina> getMateriasOfertadas() {
		return materiasOfertadas;
	}

	public void setMateriasOfertadas(List<Disciplina> materiasOfertadas) {
		this.materiasOfertadas = materiasOfertadas;
	}

}
