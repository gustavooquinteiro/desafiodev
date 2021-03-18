package desafiodev.service;

import java.io.Serializable;

import javax.inject.Inject;
import desafiodev.model.Professor;
import desafiodev.repository.Professores;

public class CadastroProfessorService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private Professores profs;
	
	public Professor salvar(Professor d) {
		return profs.guardar(d);
	}
}
