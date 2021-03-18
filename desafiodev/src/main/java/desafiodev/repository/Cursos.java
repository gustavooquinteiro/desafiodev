package desafiodev.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import desafiodev.model.Curso;

public class Cursos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Inject
	private EntityManager manager;

	public Curso porId(Long id) {
		return manager.find(Curso.class, id);
	}

	public Curso guardar(Curso user) {
		user = manager.merge(user);
		return user;
	}

}
