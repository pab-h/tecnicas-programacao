package controle;

import java.util.ArrayList;
import java.util.Random;

import controle.aspiradorvirtual.AspiradorVirtual;
import controle.obstaculovirtual.AlunoVirtual;
import controle.obstaculovirtual.ObstaculoVirtual;
import controle.obstaculovirtual.PoeiraVirtual;
import controle.tabuleirovirtual.CelulaVirtual;
import controle.tabuleirovirtual.TabuleiroVirtual;

public final class Gerenciador {

	private Jogador jogador;
	private ArrayList<AspiradorVirtual> aspiradoresVirtuais;
	private ArrayList<ObstaculoVirtual> obstaculosVirtuais;
	private AspiradorVirtual AspiradorVirtualSelecionado;
	private TabuleiroVirtual tabuleiroVirtual;
	private int alunosAchados;
	private int poeirasAchadas;
	
	public Gerenciador() {
		this.jogador = null;
		this.aspiradoresVirtuais = new ArrayList<AspiradorVirtual>();
		this.obstaculosVirtuais = new ArrayList<ObstaculoVirtual>();
		this.AspiradorVirtualSelecionado = null;
		this.alunosAchados = 0;
		this.poeirasAchadas = 0;
		this.tabuleiroVirtual = new TabuleiroVirtual(8, 8);
		
		this.adicionaAlunoVirtualSorteado(10);
		this.adicionaPoeiraVirtualSorteado(15);
		
	}

	private void adicionaAlunoVirtualSorteado(int quantidade) {
		for(int i = 0; i < quantidade; i ++) {
			this.adicionaAlunoVirtualSorteado();
		}
		
	}
	
	private void adicionaAlunoVirtualSorteado() {
		Random random = new Random();
	
		int linha_sorteada = random.nextInt(this.tabuleiroVirtual.getLinhas());
		int coluna_sorteada = random.nextInt(this.tabuleiroVirtual.getColunas());
	
		CelulaVirtual celulaVirtualSorteada = this.tabuleiroVirtual
			.getCelulaVirtual(linha_sorteada, coluna_sorteada);
		
		try {
			new AlunoVirtual(celulaVirtualSorteada);
			
		} catch (Exception e) {
			this.adicionaAlunoVirtualSorteado();
		}

	}
	
	private void adicionaPoeiraVirtualSorteado(int quantidade) {
		for(int i = 0; i < quantidade; i ++) {
			this.adicionaPoeiraVirtualSorteado();
		}
		
	}
	
	private void adicionaPoeiraVirtualSorteado() {
		Random random = new Random();
	
		int linha_sorteada = random.nextInt(this.tabuleiroVirtual.getLinhas());
		int coluna_sorteada = random.nextInt(this.tabuleiroVirtual.getColunas());
	
		CelulaVirtual celulaVirtualSorteada = this.tabuleiroVirtual
			.getCelulaVirtual(linha_sorteada, coluna_sorteada);
		
		try {
			new PoeiraVirtual(celulaVirtualSorteada);
			
		} catch (Exception e) {
			this.adicionaPoeiraVirtualSorteado();
		}

	}
	
	public Jogador getJogador() {
		return this.jogador;
	}

	public void setJogador(Jogador jogador) {
		this.jogador = jogador;
	}

	public AspiradorVirtual getAspiradorVirtualSelecionado() {
		return this.AspiradorVirtualSelecionado;
	}

	public void setAspiradorVirtualSelecionado(AspiradorVirtual aspiradorVirtualSelecionado) {
		this.AspiradorVirtualSelecionado = aspiradorVirtualSelecionado;
	}

	public int getAlunosAchados() {
		return this.alunosAchados;
	}

	public void setAlunosAchados(int alunosAchados) {
		this.alunosAchados = alunosAchados;
	}

	public int getPoeirasAchadas() {
		return this.poeirasAchadas;
	}

	public void setPoeirasAchadas(int poeirasAchadas) {
		this.poeirasAchadas = poeirasAchadas;
	}

	public ArrayList<AspiradorVirtual> getAspiradoresVirtuais() {
		return this.aspiradoresVirtuais;
	}

	public ArrayList<ObstaculoVirtual> getObstaculosVirtuais() {
		return this.obstaculosVirtuais;
	}
	
	
	
}
