package robos;

import plano.Celula;
import plano.Plano;

public class Torre extends RoboAbstrato {

	public Torre(Plano plano, Celula celulaAtual) {
		super("♜", "Torre", plano, celulaAtual, 2);

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
