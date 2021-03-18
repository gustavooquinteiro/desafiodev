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
	
	public PesquisaDisciplinasBean() {
		setMateriasOfertadas(new ArrayList<>());
	}
	
	public void pesquisar() {
		setMateriasOfertadas(pds.pesquisar(nome));
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
