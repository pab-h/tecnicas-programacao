package controle.tabuleirovirtual;

import controle.aspiradorvirtual.AspiradorVirtual;

import controle.obstaculovirtual.ObstaculoVirtual;

public final class CelulaVirtual {
	
	private int linha;
	private int coluna;
	private AspiradorVirtual aspiradorVirtual;
	private ObstaculoVirtual obstaculo;
	private boolean celulaVisitada;
	
	public CelulaVirtual(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.celulaVisitada = false;
		this.aspiradorVirtual = null;
		this.obstaculo = null;
		
	}

	public int getLinha() {
		return this.linha;
	}

	public int getColuna() {
		return this.coluna;
	}
	
	public boolean estaVazia() {
		return this.obstaculo == null;
	}
	
	
}
