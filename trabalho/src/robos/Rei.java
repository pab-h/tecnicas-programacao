package robos;

import plano.Celula;
import plano.Plano;

public class Rei extends RoboAbstrato {

	public Rei(Plano plano, Celula celulaAtual) {
		super("♚", "Rei", plano, celulaAtual, Integer.MAX_VALUE);
		
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
