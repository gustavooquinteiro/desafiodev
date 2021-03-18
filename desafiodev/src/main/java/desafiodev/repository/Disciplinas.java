package desafiodev.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import desafiodev.model.Aluno;
import desafiodev.model.Curso;
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

	public List<Disciplina> filtrarAluno(String nome) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Aluno.class);
		criteria.add(Restrictions.eq(nome, "nome"));
		Aluno a = (Aluno) criteria.list().get(0);
		return a.getDisciplinas();
	}
	
	public List<Disciplina> filtrar(String nome) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Curso.class);
		criteria.add(Restrictions.eq(nome, "nome"));
		Curso a = (Curso) criteria.list().get(0);
		return a.getDisciplinas();
	}
}
