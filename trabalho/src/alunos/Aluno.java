package alunos;

import metadata.Entidade;
import plano.Celula;

public class Aluno extends Entidade {

	public Aluno(Celula celulaAtual) {
		super("😰", celulaAtual);
		this.getCelulaAtual().setAluno(this);

	}

}
