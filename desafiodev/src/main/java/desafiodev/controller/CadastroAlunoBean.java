package desafiodev.controller;

import javax.inject.Inject;

import desafiodev.model.Aluno;
import desafiodev.service.CadastroAlunoService;
import desafiodev.util.jsf.FacesUtil;

public class CadastroAlunoBean {

	private static final long serialVersionUID = 1L;

	@Inject
	private CadastroAlunoService cus;

	private Aluno aluno;
	
	public CadastroAlunoBean() {
		limpar();
	}

	private void limpar() {
		aluno = new Aluno();
	}

	public void salvar() {
		cus.salvar(aluno);
		limpar();
		FacesUtil.addInfoMessage("Cadastro feito com sucesso!!");
	}

	public Aluno getaluno() {
		return aluno;
	}

	public void setaluno(Aluno aluno) {
		this.aluno = aluno;
	}


}
