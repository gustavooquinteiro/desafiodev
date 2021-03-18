package desafiodev.repository;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import desafiodev.model.Disciplina;

public class Disciplinas implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Disciplina porId(Long id) {
		return manager.find(Disciplina.class, id);
	}

	public Disciplina guardar(Disciplina user) {
		user = manager.merge(user);
		return user;
	}
}
