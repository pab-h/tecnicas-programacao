package robos;

import plano.Celula;
import plano.Plano;

public class Peao extends RoboAbstrato {

	public Peao(Plano plano, Celula celulaAtual) {
		super("P", "Peão", plano, celulaAtual, 1);
		
	}
	
	public void avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha(), celulaAtual.getColuna() + 1);
		
	}

	public void retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha(), celulaAtual.getColuna() - 1);
		
	}

}
