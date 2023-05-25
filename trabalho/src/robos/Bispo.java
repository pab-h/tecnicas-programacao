package robos;

import plano.Celula;
import plano.Plano;

public class Bispo extends RoboAbstrato {

	public Bispo(Plano plano, Celula celulaAtual) {
		super("B", "Bispo", plano, celulaAtual, 2);
		
	}
	
	public void avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha() - 1, celulaAtual.getColuna());
		
	}

	public void retroceder() {
		// TODO Auto-generated method stub
		
	}

}
