package controle;

import java.util.ArrayList;

import controle.aspiradorvirtual.AspiradorVirtual;

import controle.obstaculovirtual.ObstaculoVirtual;

import controle.tabuleirovirtual.TabuleiroVirtual;

public final class Jogo {

	private Jogador jogador;
	private ArrayList<AspiradorVirtual> aspiradoresVirtuais;
	private ArrayList<ObstaculoVirtual> obstaculosVirtuais;
	private AspiradorVirtual AspiradorVirtualSelecionado;
	private TabuleiroVirtual tabuleiroVirtual;
	private int alunosAchados;
	private int poeirasAchadas;
	
	public Jogo() {
		this.jogador = null;
		this.aspiradoresVirtuais = new ArrayList<AspiradorVirtual>();
		this.obstaculosVirtuais = new ArrayList<ObstaculoVirtual>();
		this.AspiradorVirtualSelecionado = null;
		this.alunosAchados = 0;
		this.poeirasAchadas = 0;
		this.tabuleiroVirtual = new TabuleiroVirtual(8, 8);
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
