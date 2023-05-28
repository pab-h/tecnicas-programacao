package alunos;

import metadata.Entidade;
import plano.Celula;

public class Aluno extends Entidade {

	public Aluno(Celula celulaAtual) throws Exception {
		super("😰", celulaAtual);
		
		if (this.getCelulaAtual().temAluno()) {
			throw new Exception("Já tem aluno!");
		}
		
		if (this.getCelulaAtual().temBug()) {
			throw new Exception("Bug e aluno não podem estar juntos!");
		}
		
		this.getCelulaAtual().setAluno(this);

	}

}
