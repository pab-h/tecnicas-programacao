package robos;

import plano.Celula;
import plano.Plano;

public class Rainha extends RoboAbstrato {

	public Rainha(Plano plano, Celula celulaAtual) {
		super("R", "Rainha", plano, celulaAtual, 4);
		
	}
	
	public void avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha() - 1, celulaAtual.getColuna());
		
	}
	
 
	public void retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha() + 1, celulaAtual.getColuna());
		
	}

}
