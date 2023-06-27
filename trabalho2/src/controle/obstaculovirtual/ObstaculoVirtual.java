package controle.obstaculovirtual;

import controle.tabuleirovirtual.CelulaVirtual;

public abstract class ObstaculoVirtual {
	
	private String imagem;
	
	private CelulaVirtual celulaVirtualAtual;
	
	public ObstaculoVirtual(String imagem, CelulaVirtual celulaVirtualAtual) throws Exception {
		this.imagem = imagem;
		this.celulaVirtualAtual = celulaVirtualAtual;
		
		if (!celulaVirtualAtual.semObstaculo()) {
			throw new Exception("Celula Virutal esta ocupada");
		}
		
		this.celulaVirtualAtual.setObstaculoVirtual(this);
		
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
