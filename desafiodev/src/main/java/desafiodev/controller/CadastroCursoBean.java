package desafiodev.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import desafiodev.model.Curso;
import desafiodev.service.CadastroCursoService;
import desafiodev.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroCursoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroCursoService ccs;
	
	private Curso curso;
	
	private void limpar() {
		curso = new Curso();
	}

	public void salvar() {
		ccs.salvar(curso);
		limpar();
		FacesUtil.addInfoMessage("Cadastro feito com sucesso!!");
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}


}
