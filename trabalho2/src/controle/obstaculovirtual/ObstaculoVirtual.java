package controle.obstaculovirtual;

import controle.tabuleirovirtual.CelulaVirtual;

public abstract class ObstaculoVirtual {
	
	private String imagem;
	
	private CelulaVirtual celulaVirtualAtual;
	
	public ObstaculoVirtual(String imagem, CelulaVirtual celulaVirtualAtual) {
		this.imagem = imagem;
		this.celulaVirtualAtual = celulaVirtualAtual;
	}

	public String getImagem() {
		return this.imagem;
	}

	public int getPontuacao() {
		return 0;
	}
	
	public CelulaVirtual getCelulaVirtualAtual() {
		return this.celulaVirtualAtual;
	}
	
}
