package desafiodev.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import desafiodev.model.Disciplina;
import desafiodev.repository.Alunos;

public class PesquisaAlunoService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Alunos materias;
	
	public List<Disciplina> pesquisar(String nome){
		return materias.pesquisar(nome);
	}
}
