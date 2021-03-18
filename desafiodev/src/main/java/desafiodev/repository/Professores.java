package desafiodev.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import desafiodev.model.Professor;

public class Professores implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Professor porId(Long id) {
		return manager.find(Professor.class, id);
	}

	public Professor guardar(Professor user) {
		user = manager.merge(user);
		return user;
	}
	
}
