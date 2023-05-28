package robos;

import plano.Celula;
import plano.Plano;

public class Peao extends RoboAbstrato {

	public Peao(Plano plano, Celula celulaAtual) {
		super("♟", "Peão", plano, celulaAtual, 1);
		
	}
	
	public boolean avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		return this.mover(celulaAtual.getLinha(), celulaAtual.getColuna() + 1);
	}

	public boolean retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		return this.mover(celulaAtual.getLinha(), celulaAtual.getColuna() - 1);
	}

}
