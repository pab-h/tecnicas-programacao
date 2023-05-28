package bugs;

import metadata.Entidade;
import plano.Celula;

public class Bug extends Entidade {

	public Bug(Celula celulaAtual) throws Exception {
		super("🐛", celulaAtual);
	
		if (this.getCelulaAtual().temAluno()) {
			throw new Exception("Bug e aluno não podem estar juntos!");
		}
		
		if (this.getCelulaAtual().temBug()) {
			throw new Exception("Já tem bug!");
		}
		
		
		this.getCelulaAtual().setBug(this);
		
	}

}
