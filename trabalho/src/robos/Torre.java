package robos;

import plano.Celula;
import plano.Plano;

public class Torre extends RoboAbstrato {

	public Torre(Plano plano, Celula celulaAtual) {
		super("♜", "Torre", plano, celulaAtual, 2);

	}

	public void avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha(), celulaAtual.getColuna() - 1);
		
	}

	public void retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha(), celulaAtual.getColuna() - 1);
		
	}

}
