package desafiodev.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import desafiodev.model.Disciplina;
import desafiodev.repository.Disciplinas;

public class PesquisaDisciplinaService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Disciplinas materias;
	
	public List<Disciplina> pesquisarCurso(String nome){
		return materias.filtrar(nome);
	}
	
	public List<Disciplina> pesquisarAluno(String nome){
		return materias.filtrarAluno(nome);
	}
}
