package controle.tabuleirovirtual;

public class CelulaVirtual {
	
	private int linha;
	private int coluna;
	private AspiradorVirutal aspiradorVirtual;
	private Obstaculo obstaculo;
	private boolean celulaVisitada;
	
	public CelulaVirtual(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.celulaVisitada = false;
	}

	public int getLinha() {
		return this.linha;
	}

	public int getColuna() {
		return this.coluna;
	}
	
}
