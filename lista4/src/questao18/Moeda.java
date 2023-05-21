package questao18;;

public final class Moeda extends Entidade {

	public Moeda(Celula celulaAtual) {
		super("$", celulaAtual);
		
		this.getCelulaAtual().setMoeda(this);
	}
	
}
