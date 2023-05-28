package jogo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

import alunos.Aluno;

import bugs.Bug;

import plano.Celula;
import plano.Plano;
import robos.Andador;
import robos.Bispo;
import robos.Cavalo;
import robos.Peao;
import robos.Rainha;
import robos.Rei;
import robos.RoboAbstrato;
import robos.Torre;

public class Jogo {
	private Scanner scanner;
	private Plano plano;
	private ArrayList<RoboAbstrato> robos;
	
	public void setup() {
		this.scanner = new Scanner(System.in);
		
		this.robos = new ArrayList<RoboAbstrato>();
		this.plano = new Plano(8, 7);
		
		Torre torre = new Torre(plano, plano.getCelula(7, 0));
		Bispo bispo = new Bispo(plano, plano.getCelula(7, 1));
		Rei rei = new Rei(plano, plano.getCelula(7, 2));
		Rainha rainha = new Rainha(plano, plano.getCelula(7, 3));
		Cavalo cavalo = new Cavalo(plano, plano.getCelula(7, 4));
		Peao peao = new Peao(plano, plano.getCelula(7, 5));
		Andador andador = new Andador(plano, plano.getCelula(7, 6));

		this.robos.add(torre);
		this.robos.add(bispo);
		this.robos.add(rei);
		this.robos.add(rainha);
		this.robos.add(cavalo);
		this.robos.add(peao);
		this.robos.add(andador);

		this.setAlunoSorteado(10);
		this.setBugSorteado(10);
		
		System.out.println(plano);
	}

	private void setBugSorteado(int quantidade) {
		for(int i = 0; i < quantidade; i ++) {
			this.setBugSorteado();
		}
		
	}
	
	private void setBugSorteado() {
		Random random = new Random();
	
		int linha_sorteada = random.nextInt(this.plano.getLinhas() - 1);
		int coluna_sorteada = random.nextInt(this.plano.getColunas());
		
		Celula celulaSorteada = this.plano.getCelula(linha_sorteada, coluna_sorteada);
	
		try {
			new Bug(celulaSorteada);			
		} catch (Exception e) {
			this.setBugSorteado();
		}
		
	}
	
	private void setAlunoSorteado(int quantidade) {
		for(int i = 0; i < quantidade; i ++) {
			this.setAlunoSorteado();
		}
		
	}
	
	private void setAlunoSorteado() {
		Random random = new Random();
	
		int linha_sorteada = random.nextInt(this.plano.getLinhas() - 1);
		int coluna_sorteada = random.nextInt(this.plano.getColunas());
		
		Celula celulaSorteada = this.plano.getCelula(linha_sorteada, coluna_sorteada);
	
		try {
			new Aluno(celulaSorteada);			
		} catch (Exception e) {
			this.setAlunoSorteado();
		}
		
	}
	
	private RoboAbstrato getMelhorRobo() {
		RoboAbstrato melhorRobo = robos.get(0);
		
		for (RoboAbstrato robo : robos) {
			if (robo.getPontuacao() > melhorRobo.getPontuacao()) {
				melhorRobo = robo;
			}
		}
		
		return melhorRobo;
	}
	
	private int getAlunosResgatados() {
		int totalResgatados = 0;
		
		for (RoboAbstrato roboAbstrato : robos) {
			totalResgatados += roboAbstrato.getAlunosResgatados();
		}
		
		return totalResgatados;
	}
	
	private int getBugsEncontrados() {
		int totalEncontrados = 0;
		
		for (RoboAbstrato roboAbstrato : this.robos) {
			totalEncontrados += roboAbstrato.getBugsEncontrados();
		}
		
		return totalEncontrados;
	}
	
	private String gerarRelatorioRodada() {
		String relatorio = "==================\n";
		
		for (RoboAbstrato robo : this.robos) {
			relatorio += "Nome: " + robo.getNome() + "\n";
			relatorio += "Pontuação: " + robo.getPontuacao() + "\n";
			relatorio += "Alunos resgatados: " + robo.getAlunosResgatados() + "\n";
			relatorio += "Bugs resgatados: " + robo.getAlunosResgatados() + "\n";
			relatorio += "Local atual: " + "("+ robo.getCelulaAtual().getLinha() + ", " + robo.getCelulaAtual().getColuna() +")\n\n";
		}
		
		relatorio += "==================\n";
		
		return relatorio;
	}
	
	private String gerarRelatorioFinal() {
		String relatorio = "==================\n";
		
		for (RoboAbstrato robo : this.robos) {
			relatorio += "Nome: " + robo.getNome() + "\n";
			relatorio += "Pontuação: " + robo.getPontuacao() + "\n";
			relatorio += "Alunos resgatados: " + robo.getAlunosResgatados() + "\n";
			relatorio += "Bugs resgatados: " + robo.getAlunosResgatados() + "\n";
			relatorio += "Celulas visitadas:\n";
			
			for (Celula celulaVisitada : robo.getCelulasVisitadas()) {
				relatorio += "-> ("+ celulaVisitada.getLinha() + ", " + celulaVisitada.getColuna() +")\n";
			}
			
			relatorio += "\n";
			
		}

		RoboAbstrato melhorRobo = this.getMelhorRobo();
		
		relatorio += "\nMelhor robô: " + melhorRobo.getNome() + " [" + melhorRobo.getPontuacao() + "]" + "\n";
		relatorio += "==================\n";
		
		return relatorio;
	}
	
	public void run() {
		
	}
}
