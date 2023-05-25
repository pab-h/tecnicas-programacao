package metadata;

import plano.Celula;

public abstract class Entidade {
	
	private String identificador;
	private Celula celulaAtual;
	
	public Entidade(String identificador, Celula celulaAtual) {
		this.identificador = identificador;
		this.celulaAtual = celulaAtual;
		
	}

	public void setCelulaAtual(Celula celula) {
		this.celulaAtual = celula;
		
	}
	
	public Celula getCelulaAtual() {
		return this.celulaAtual;
	}
	
	public String toString() {
		return this.identificador;
	}
	
}
