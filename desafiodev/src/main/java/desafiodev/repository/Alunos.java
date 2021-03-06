package desafiodev.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import desafiodev.model.Aluno;
import desafiodev.model.Disciplina;

public class Alunos implements Serializable{


	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public Aluno porId(Long id) {
		return manager.find(Aluno.class, id);
	}

	public Aluno guardar(Aluno user) {
		user = manager.merge(user);
		return user;
	}

	@SuppressWarnings("unchecked")
	public Aluno filtrar(String nome) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Aluno.class);

		if (StringUtils.isNotBlank(nome)) {
			criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		}
		Aluno b = (Aluno) criteria.list().get(0);
		return b;
	}

	@SuppressWarnings("unchecked")
	public List<Aluno> buscar() {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Aluno.class);
		return criteria.list();
	}
	@SuppressWarnings("unchecked")
	public List<Disciplina> pesquisar(String nome) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Aluno.class);

		if (StringUtils.isNotBlank(nome)) {
			criteria.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		}
		Aluno b = (Aluno) criteria.list().get(0);
		return b.getDisciplinas();
	}

	public List<Aluno> pesquisarAluno(String nome) {
		Session session = manager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Disciplina.class);
		criteria.add(Restrictions.eq(nome, "nome"));
		Disciplina a = (Disciplina) criteria.list().get(0);
		return a.getAluno();
	}

}
