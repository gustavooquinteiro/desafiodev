package desafiodev.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import desafiodev.model.Aluno;
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
	private List<Aluno> alunosCadastradosNaMateria;
	
	public PesquisaAlunoBean() {
		setmateriasCadastradas(new ArrayList<>());
	}
	
	public void pesquisar() {
		setmateriasCadastradas(pds.pesquisar(nome));
	}

	public void pesquisarAlunos(){
		setAlunosCadastradosNaMateria(pds.pesquisarAluno(nome));
	}
	public List<Disciplina> getmateriasCadastradas() {
		return materiasCadastradas;
	}

	public void setmateriasCadastradas(List<Disciplina> materiasCadastradas) {
		this.materiasCadastradas = materiasCadastradas;
	}

	public List<Aluno> getAlunosCadastradosNaMateria() {
		return alunosCadastradosNaMateria;
	}

	public void setAlunosCadastradosNaMateria(List<Aluno> alunosCadastradosNaMateria) {
		this.alunosCadastradosNaMateria = alunosCadastradosNaMateria;
	}

}
