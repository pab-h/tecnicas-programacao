package robos;

import plano.Celula;
import plano.Plano;

public class Rei extends RoboAbstrato {

	public Rei(Plano plano, Celula celulaAtual) {
		super("♚", "Rei", plano, celulaAtual, 4);
		
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
