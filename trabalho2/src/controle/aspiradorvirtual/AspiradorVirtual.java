package controle.aspiradorvirtual;

import controle.obstaculovirtual.ObstaculoVirtual;
import controle.tabuleirovirtual.CelulaVirtual;

public abstract class AspiradorVirtual {
	
	private String imagem;
	private String nome;
	private int pontuacao;
	private CelulaVirtual celulaVirtualAtual;
	
	public AspiradorVirtual(String imagem, String nome) {
		this.imagem = imagem;
		this.nome = nome;
		this.pontuacao = 0;
		this.celulaVirtualAtual = null;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public CelulaVirtual getCelulaVirtualAtual() {
		return this.celulaVirtualAtual;
	}

	public void setCelulaVirtualAtual(CelulaVirtual celulaVirtualAtual) {
		this.celulaVirtualAtual = celulaVirtualAtual;
		
		if (this.celulaVirtualAtual == null) {
			return;
		}
		
		if (!this.celulaVirtualAtual.estaVazia()) {
			ObstaculoVirtual obstaculoVirtual = this.celulaVirtualAtual.getObstaculoVirtual();
		
			this.setPontuacao(this.getPontuacao() + obstaculoVirtual.getPontuacao());
		}		
		
	}

	public String getImagem() {
		return this.imagem;
	}

	public String getNome() {
		return this.nome;
	}
	
}
