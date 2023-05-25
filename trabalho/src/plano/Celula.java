package plano;

import robos.RoboAbstrato;

import alunos.Aluno;

import bugs.Bug;
import metadata.Entidade;

import java.util.ArrayList;

public class Celula {

	private int linha;
	private int coluna;
	
	private ArrayList<Entidade> entidades;
	private ArrayList<RoboAbstrato> robos;	
	private Aluno aluno;
	private Bug bug;
	
	public Celula(int linha , int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		
		this.robos = new ArrayList<RoboAbstrato>();
		this.entidades = new ArrayList<Entidade>();
		
	}
	
	public boolean temBug() {
		return this.bug != null;
	}
	
	public boolean temAluno() {
		return this.aluno != null;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
		this.entidades.add(aluno);
		
	}
	
	public void unsetAluno() {
		this.entidades.remove(this.aluno);
		this.aluno = null;
	}
	
	public int getLinha() {
		return this.linha;
	}
	
	public int getColuna() {
		return this.coluna;
	}
	
	public void setRobo(RoboAbstrato robo) {
		if (!this.robos.contains(robo)) {
			this.robos.add(robo);
			this.entidades.add(robo);
		}
		
	}
	
	public void unsetRobo(RoboAbstrato robo) {
		if (this.robos.contains(robo)) {
			this.robos.remove(robo);
			this.entidades.remove(robo);
		}
		
	}
	
	public String toString() {
		String out = "";
		
		if (this.entidades.size() == 0) {
			out = "0";
		}
		
		for (Entidade entidade : entidades) {
			out += entidade;
		}
		
		return out;
	}
	
	
}
