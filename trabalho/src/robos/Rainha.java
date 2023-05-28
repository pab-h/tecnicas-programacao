package robos;

import plano.Celula;
import plano.Plano;

public class Rainha extends RoboAbstrato {

	public Rainha(Plano plano, Celula celulaAtual) {
		super("♛", "Rainha", plano, celulaAtual, 4);
		
	}
	
	public boolean avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		return this.mover(celulaAtual.getLinha() - 1, celulaAtual.getColuna());
	}
	
 
	public boolean retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		return this.mover(celulaAtual.getLinha() + 1, celulaAtual.getColuna());
	}

}
