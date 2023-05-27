package robos;

import plano.Celula;
import plano.Plano;

public class Cavalo extends RoboAbstrato {

	public Cavalo(Plano plano, Celula celulaAtual) {
		super("♞", "Cavalo", plano, celulaAtual, 2);
		
	}
	
	public void avancar() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha() + 1, celulaAtual.getColuna() + 1);
		
	}
	
	public void retroceder() {
		Celula celulaAtual = this.getCelulaAtual();	
		
		this.mover(celulaAtual.getLinha() - 1, celulaAtual.getColuna() - 1);
		
	}

}
