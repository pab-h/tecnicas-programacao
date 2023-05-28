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
	
	public boolean mover(int linha, int coluna) {
		try {
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
			
			return true;
			
		} catch (Exception e) {
			return false;
		}
	}
	
	private void penalizarse() {
		this.pontuacao -= 15;
		this.bugsEncontrados++;
		
	}
	
	private void resgatarAluno() {
		this.pontuacao += 10;
		this.getCelulaAtual().unsetAluno();
		this.alunosRegastados++;
		
	}
	
	public int getMaximoMovimento() {
		return this.maximoMovimento;
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
	
	public int getAlunosResgatados() {
		return this.alunosRegastados;
	}
	
	public int getBugsEncontrados() {
		return this.bugsEncontrados;
	}
	
	public ArrayList<Celula> getCelulasVisitadas() {
		return this.celulasVisitadas;
	}
	
	public abstract boolean avancar();
	
	public boolean avancar(int passos) {
		if (passos > this.maximoMovimento) {
			return false;
		}
 		
		for (int i = 0; i < passos; i++) {
			if (!this.avancar()) {
				return false;
			}
		}
		
		return true;
	}
	
	public abstract boolean retroceder();
	
	public boolean retroceder(int passos) {
		if (passos > this.maximoMovimento) {
			return false;
		}
		
		for (int i = 0; i < passos; i++) {
			if (!this.retroceder()) {
				return false;
			}
		}
		
		return true;
		
	}
	
}
