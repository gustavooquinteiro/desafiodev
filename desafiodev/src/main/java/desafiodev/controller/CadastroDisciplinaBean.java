package desafiodev.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import desafiodev.model.Disciplina;
import desafiodev.service.CadastroDisciplinaService;
import desafiodev.util.jsf.FacesUtil;

@Named
@ViewScoped
public class CadastroDisciplinaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Disciplina disciplina;
	@Inject
	private CadastroDisciplinaService cds;
	public CadastroDisciplinaBean() {
		limpar();
	}

	private void limpar() {
		disciplina = new Disciplina();
	}

	public void salvar() {
		cds.salvar(disciplina);
		limpar();
		FacesUtil.addInfoMessage("Cadastro feito com sucesso!!");
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}



	
}
