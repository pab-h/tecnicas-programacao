package alunos;

import metadata.Entidade;
import plano.Celula;

public class Aluno extends Entidade {

	public Aluno(Celula celulaAtual) {
		super("a", celulaAtual);
		this.getCelulaAtual().setAluno(this);

	}

}
