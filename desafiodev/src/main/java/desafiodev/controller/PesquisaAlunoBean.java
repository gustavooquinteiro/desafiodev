package desafiodev.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import desafiodev.model.Disciplina;
import desafiodev.service.PesquisaAlunoService;
import desafiodev.service.PesquisaDisciplinaService;

@Named
@ViewScoped
public class PesquisaAlunoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PesquisaAlunoService pds;
	
	private String nome;
	private List<Disciplina> materiasCadastradas;
	
	public PesquisaAlunoBean() {
		setmateriasCadastradas(new ArrayList<>());
	}
	
	public void pesquisar() {
		setmateriasCadastradas(pds.pesquisar(nome));
	}

	public List<Disciplina> getmateriasCadastradas() {
		return materiasCadastradas;
	}

	public void setmateriasCadastradas(List<Disciplina> materiasCadastradas) {
		this.materiasCadastradas = materiasCadastradas;
	}

}
