package robos;

import plano.Celula;
import plano.Plano;

public class Andador extends RoboAbstrato {

	public Andador(Plano plano, Celula celulaAtual) {
		super("®", "Andador", plano, celulaAtual, Integer.MAX_VALUE);
		
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
