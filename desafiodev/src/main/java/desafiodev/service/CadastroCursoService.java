package desafiodev.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafiodev.model.Curso;
import desafiodev.repository.Cursos;

public class CadastroCursoService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Cursos clientes;
	
	public Curso salvar(Curso curso) {
		return clientes.guardar(curso); 	
	}

}
