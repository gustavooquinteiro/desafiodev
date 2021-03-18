package desafiodev.controller;

import java.io.Serializable;

import javax.inject.Inject;

import desafiodev.model.Professor;
import desafiodev.service.CadastroProfessorService;
import desafiodev.util.jsf.FacesUtil;

public class CadastroProfessorBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Professor professor;
	@Inject
	private CadastroProfessorService cps;
	public CadastroProfessorBean() {
		limpar();
	}

	private void limpar() {
		professor = new Professor();
	}

	public void salvar() {
		cps.salvar(professor);
		limpar();
		FacesUtil.addInfoMessage("Cadastro feito com sucesso!!");
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
