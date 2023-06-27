package controle.tabuleirovirtual;

import controle.aspiradorvirtual.AspiradorVirtual;

import controle.obstaculovirtual.ObstaculoVirtual;

public final class CelulaVirtual {
	
	private int linha;
	private int coluna;
	private AspiradorVirtual aspiradorVirtual;
	private ObstaculoVirtual obstaculoVirtual;
	
	public CelulaVirtual(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.aspiradorVirtual = null;
		this.obstaculoVirtual = null;
		
	}

	public int getLinha() {
		return this.linha;
	}

	public int getColuna() {
		return this.coluna;
	}
	
	public boolean semObstaculo() {
		return this.obstaculoVirtual == null;
	}
	
	public void setAspiradorVirtual(AspiradorVirtual aspiradorVirtual) {
		this.aspiradorVirtual = aspiradorVirtual;
	}

	public ObstaculoVirtual getObstaculoVirtual() {
		return this.obstaculoVirtual;
	}
	
	public void setObstaculoVirtual(ObstaculoVirtual obstaculoVirtual) {
		this.obstaculoVirtual = obstaculoVirtual;
	}
	
}
