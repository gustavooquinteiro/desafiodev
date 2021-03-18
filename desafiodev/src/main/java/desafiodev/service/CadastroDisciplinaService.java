package desafiodev.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafiodev.model.Disciplina;
import desafiodev.repository.Disciplinas;

public class CadastroDisciplinaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Disciplinas disciplina;
	
	public Disciplina salvar(Disciplina d) {
		if (d.getAluno().size() < 9)
			return disciplina.guardar(d);
		return null;
	}
	
	

}
