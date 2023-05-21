package questao18;

public abstract class Entidade {
	private Celula celulaAtual;
	private String simbolo;
	
	public Entidade(String simbolo, Celula celula) {
		this.celulaAtual = celula;
		this.simbolo = simbolo;
	}
	
	public Celula getCelulaAtual() {
		return this.celulaAtual;
	}
	
	public String getSimbolo() {
		return this.simbolo;
	}
	
	public void setCelulaAtual(Celula celula) {
		this.celulaAtual = celula;
	}
	
}
