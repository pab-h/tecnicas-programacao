package robos;

import java.util.ArrayList;

import metadata.Entidade;
import metadata.Movivel;
import plano.Celula;
import plano.Plano;	

public abstract class RoboAbstrato extends Entidade implements Movivel {
	
	private String nome;
	private int pontuacao;
	
	private ArrayList<Celula> celulasVisitadas;
	private int alunosRegastados;
	private int bugsEncontrados;
	
	private Plano plano;
	
	private int maximoMovimento;
	
	public RoboAbstrato(String identificador, String nome, Plano plano, Celula celulaAtual, int maximoMovimento) {
		super(identificador, celulaAtual);
		
		this.nome = nome;
		this.plano = plano;
		this.getCelulaAtual().setRobo(this);
		this.celulasVisitadas = new ArrayList<Celula>();
		this.celulasVisitadas.add(this.getCelulaAtual());
		this.pontuacao = 0;
		this.maximoMovimento = maximoMovimento;
		
	}
	
	public void mover(int linha, int coluna) {
		Celula destino = this.getPlano().getCelula(linha, coluna);
		
		this.getCelulaAtual().unsetRobo(this);
		destino.setRobo(this);
		this.setCelulaAtual(destino);
		this.celulasVisitadas.add(destino);
		
		if (this.getCelulaAtual().temAluno()) {
			this.resgatarAluno();
		}
		
		if (this.getCelulaAtual().temBug()) {
			this.penalizarse();
		}
		
	}
	
	private void penalizarse() {
		this.pontuacao -= 15;
		
	}
	
	private void resgatarAluno() {
		this.pontuacao += 10;
		this.getCelulaAtual().unsetAluno();
		
	}
	
	public Plano getPlano() {
		return this.plano;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getPontuacao() {
		return this.pontuacao;
	}
	
	public int getAlunosRegastados() {
		return this.pontuacao;
	}
	
	public int getBugsEncontrados() {
		return this.pontuacao;
	}
	
	public abstract void avancar();
	
	public void avancar(int n) {
		for (int i = 0; i < n; i++) {
			this.avancar();
		}
		
	}
	
	public abstract void retroceder();
	
	public void retroceder(int n) {
		for (int i = 0; i < n; i++) {
			this.retroceder();
		}
		
	}
	
}
