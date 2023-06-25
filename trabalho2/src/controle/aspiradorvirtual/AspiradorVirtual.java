package controle.aspiradorvirtual;

import controle.tabuleirovirtual.CelulaVirtual;

public abstract class AspiradorVirtual {
	
	private String imagem;
	private String nome;
	private int pontuacao;
	private CelulaVirtual CelulaVirtualAtual;
	
	public AspiradorVirtual(String imagem, String nome) {
		this.imagem = imagem;
		this.nome = nome;
		this.pontuacao = 0;
		this.CelulaVirtualAtual = null;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public CelulaVirtual getCelulaVirtualAtual() {
		return this.CelulaVirtualAtual;
	}

	public void setCelulaVirtualAtual(CelulaVirtual celulaVirtualAtual) {
		this.CelulaVirtualAtual = celulaVirtualAtual;
	}

	public String getImagem() {
		return this.imagem;
	}

	public String getNome() {
		return this.nome;
	}
	
}
