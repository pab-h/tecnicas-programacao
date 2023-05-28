package robos;

import plano.Celula;
import plano.Plano;

public class Bispo extends RoboAbstrato {

	public Bispo(Plano plano, Celula celulaAtual) {
		super("♝", "Bispo", plano, celulaAtual, 2);
		
	}
	
	public boolean avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		return this.mover(celulaAtual.getLinha() - 1, celulaAtual.getColuna() + 1);
	}
	
 
	public boolean retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		return this.mover(celulaAtual.getLinha() + 1, celulaAtual.getColuna() - 1);
	}

}
