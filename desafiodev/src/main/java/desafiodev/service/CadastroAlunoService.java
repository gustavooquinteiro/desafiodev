package desafiodev.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafiodev.model.Aluno;
import desafiodev.repository.Alunos;

public class CadastroAlunoService implements Serializable {


	private static final long serialVersionUID = 1L;

	@Inject
	private Alunos clientes;
	
	public Aluno salvar(Aluno cliente) {
		return clientes.guardar(cliente); 	
	}
	
}
