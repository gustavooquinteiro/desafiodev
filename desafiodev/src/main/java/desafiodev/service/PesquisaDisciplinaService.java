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
	
	public List<Disciplina> pesquisar(String nome){
		return materias.filtrar(nome);
	}
}
