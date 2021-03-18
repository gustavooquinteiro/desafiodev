package desafiodev.controller;

import java.io.Serializable;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import desafiodev.model.Aluno;
import desafiodev.service.CadastroAlunoService;
import desafiodev.util.jsf.FacesUtil;
import desafiodev.util.jsf.RestricaoAluno;
@Named
@ViewScoped
public class CadastroAlunoBean implements Serializable {

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
		RestricaoAluno response = cus.salvar(aluno);
		if (response.equals(RestricaoAluno.VAGAS_ENCERRADAS)) {
			FacesUtil.addInfoMessage("Inscrições encerradas para a matéria");
		} else if (response.equals(RestricaoAluno.SOBRECARGA_CH)) {
			FacesUtil.addInfoMessage("Sobrecarga de carga horária");
		}else {
			limpar();
			FacesUtil.addInfoMessage("Cadastro feito com sucesso!!");
		}
	}

	public Aluno getaluno() {
		return aluno;
	}

	public void setaluno(Aluno aluno) {
		this.aluno = aluno;
	}


}
