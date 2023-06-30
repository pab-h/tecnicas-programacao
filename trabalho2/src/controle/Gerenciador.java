package controle;

import java.util.ArrayList;
import java.util.Random;

import controle.aspiradorvirtual.AspiradorVirtual;
import controle.aspiradorvirtual.AspiradorVirtualAzul;
import controle.aspiradorvirtual.AspiradorVirtualPreto;
import controle.aspiradorvirtual.AspiradorVirtualVermelho;
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
	private int rodadas;
	
	public Gerenciador() {
		this.jogador = null;
		
		this.aspiradoresVirtuais = new ArrayList<AspiradorVirtual>();
		this.aspiradoresVirtuais.add(new AspiradorVirtualAzul());
		this.aspiradoresVirtuais.add(new AspiradorVirtualPreto());
		this.aspiradoresVirtuais.add(new AspiradorVirtualVermelho());
		
		
		this.obstaculosVirtuais = new ArrayList<ObstaculoVirtual>();
		this.AspiradorVirtualSelecionado = null;
		this.alunosAchados = 0;
		this.poeirasAchadas = 0;
		this.tabuleiroVirtual = new TabuleiroVirtual(8, 8);
		
		this.adicionaAlunoVirtualSorteado(10);
		this.adicionaPoeiraVirtualSorteado(15);
		
	}

	public boolean todosAspiradoresPosicionados() {
		for (AspiradorVirtual aspirador : this.getAspiradoresVirtuais()) {
			if (aspirador.getCelulaVirtualAtual() == null) {
				return false;
			}
		}
		
		return true;
	}
	
	public int getTotalCelulasVazias() {
		int totalCelulasVazias = 0;
		
		for(AspiradorVirtual aspiradorVirtual :this.getAspiradoresVirtuais()) {
			totalCelulasVazias += aspiradorVirtual.getCelulasVaziasEncontradas();
		}
		
		return totalCelulasVazias;
	}
	
	public int getRodadas() {
		return this.rodadas;
	}

	public void setRodadas(int rodadas) {
		this.rodadas = rodadas;
	}

	public TabuleiroVirtual getTabuleiroVirtual() {
		return this.tabuleiroVirtual;
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

	public int getPontuacaoTotal() {
		int pontuacaoTotal = 0;
		
		for(AspiradorVirtual aspiradorVirtual: this.getAspiradoresVirtuais()) {
			pontuacaoTotal += aspiradorVirtual.getPontuacao();
		}

		return pontuacaoTotal;
	}

	public int getTotalPoeirasEncontradas() {
		int totalPoeirasEncontradas = 0;
		
		for(AspiradorVirtual aspiradorVirtual: this.getAspiradoresVirtuais()) {
			totalPoeirasEncontradas += aspiradorVirtual.getPoeirasEncontradas();
		}

		return totalPoeirasEncontradas;
	}

	public int getTotalAlunosEncontrados() {
		int totalAlunosEncontrados = 0;

		for(AspiradorVirtual aspiradorVirtual: this.getAspiradoresVirtuais()) {
			totalAlunosEncontrados += aspiradorVirtual.getAlunosEncontrados();
		}
		
		return totalAlunosEncontrados;
	}
	
	
	
}
