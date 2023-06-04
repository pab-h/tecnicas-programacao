package plano;

import robos.RoboAbstrato;

import alunos.Aluno;

import bugs.Bug;

import java.util.ArrayList;

public class Celula {

	private int linha;
	private int coluna;
	
	private ArrayList<RoboAbstrato> robos;	
	private Aluno aluno;
	private Bug bug;
	
	public Celula(int linha , int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		
		this.robos = new ArrayList<RoboAbstrato>();
		
	}
	
	public boolean temRobo() {
		return this.robos.size() > 0;
	}
	
	public boolean temBug() {
		return this.bug != null;
	}
	
	public void setBug(Bug bug) {
		this.bug = bug;
		
	}
	
	public boolean temAluno() {
		return this.aluno != null;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
		
	}
	
	public void unsetAluno() {
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
		}
		
	}
	
	public void unsetRobo(RoboAbstrato robo) {
		if (this.robos.contains(robo)) {
			this.robos.remove(robo);
		}
		
	}
	
	public String toString() {
		String out = "";
		
		if (this.temBug()) {
			out = this.bug.toString();
		}
		
		if (this.temAluno()) {
			out = this.aluno.toString();
		}
		
		for (RoboAbstrato robo : this.robos) {
			out += robo;
		}
		
		if (!this.temRobo() && !this.temAluno() && !this.temBug()) {
			out = "🥦";
		}
		
		return out;
	}
	
	
}
