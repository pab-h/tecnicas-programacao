package controle.aspiradorvirtual;

import controle.obstaculovirtual.AlunoVirtual;
import controle.obstaculovirtual.ObstaculoVirtual;
import controle.obstaculovirtual.PoeiraVirtual;
import controle.tabuleirovirtual.CelulaVirtual;

public abstract class AspiradorVirtual {
	
	private String imagem;
	private String nome;
	private int pontuacao;
	private int poeirasEncontradas;
	private int alunosEncontrados;
	private int celulasVaziasEncontradas;
	private CelulaVirtual celulaVirtualAtual;
	
	public AspiradorVirtual(String imagem, String nome) {
		this.imagem = imagem;
		this.nome = nome;
		this.pontuacao = 0;
		this.celulaVirtualAtual = null;
		this.poeirasEncontradas = 0;
		this.alunosEncontrados = 0;
		this.celulasVaziasEncontradas = 0;
	}

	public int getCelulasVaziasEncontradas() {
		return this.celulasVaziasEncontradas;
	}
	
	public int getPontuacao() {
		return this.pontuacao;
	}

	public int getPoeirasEncontradas() {
		return this.poeirasEncontradas;
	}
	
	public int getAlunosEncontrados() {
		return this.alunosEncontrados;
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
		
		if (this.celulaVirtualAtual.semObstaculo()) {
			this.celulasVaziasEncontradas++;
			return;
		}
		
		ObstaculoVirtual obstaculoVirtual = this.celulaVirtualAtual.getObstaculoVirtual();
		this.setPontuacao(this.getPontuacao() + obstaculoVirtual.getPontuacao());
		
		if (obstaculoVirtual instanceof AlunoVirtual) {
			this.alunosEncontrados++;
		}
		
		if (obstaculoVirtual instanceof PoeiraVirtual) {
			this.poeirasEncontradas++;
		}
			
	}

	public String getImagem() {
		return this.imagem;
	}

	public String getNome() {
		return this.nome;
	}
	
}
