package robos;

import java.util.ArrayList;

import plano.Celula;

public abstract class RoboAbstrato {
	
	public int identificador;
	public String nome;
	public int pontuacao;
	
	public ArrayList<Celula> celulasVisitadas;
	public int alunosRegastados;
	public int bugsEncontrados;
	
	public Celula celulaAtual;
	
	public abstract void avancar();
	
	public abstract void retroceder();

}
