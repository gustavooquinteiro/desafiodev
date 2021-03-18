package desafiodev.service;

import java.io.Serializable;

import javax.inject.Inject;

import desafiodev.model.Aluno;
import desafiodev.model.Disciplina;
import desafiodev.repository.Alunos;
import desafiodev.util.jsf.RestricaoAluno;

public class CadastroAlunoService implements Serializable {


	private static final long serialVersionUID = 1L;

	@Inject
	private Alunos clientes;
	
	public RestricaoAluno salvar(Aluno cliente) {
		if (cliente.getDisciplinas().size() <= 3 && cliente.getAlternativas().size() <= 1) {
			for(Disciplina d: cliente.getDisciplinas()) {
				if(d.getAluno().size() > 9)
					return RestricaoAluno.VAGAS_ENCERRADAS;
			}
		} else {
			return RestricaoAluno.SOBRECARGA_CH;
		}
		clientes.guardar(cliente);
		return RestricaoAluno.OK;
	}
	
}
