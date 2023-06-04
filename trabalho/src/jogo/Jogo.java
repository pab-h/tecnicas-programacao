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
	private String jogador;
	private Scanner scanner;
	private Plano plano;
	private ArrayList<RoboAbstrato> robos;
	private int quantidadeAlunos;

	public Jogo() {
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
		
		relatorio += "\n"+ this.jogador +", o melhor é robô: " + melhorRobo.getNome() + " com " + melhorRobo.getPontuacao() + " pontos" + "\n";
		relatorio += "==================\n";
		
		return relatorio;
	}
	
	private boolean todosAlunosResgatados() {
		int totalResgatados = 0;
		
		for (RoboAbstrato robo : this.robos) {
			totalResgatados += robo.getAlunosResgatados();
		}
		
		return totalResgatados == this.quantidadeAlunos;
	}
	
	public void run() {
		System.out.println("Qual seu nome, jogador?");
		this.jogador = this.scanner.nextLine();

		System.out.println("Quantos alunos?");
		this.quantidadeAlunos = this.scanner.nextInt();
		
		System.out.println("Quantos bugs?");
		int quantidadeBugs = this.scanner.nextInt(); 

		int quantidadeCelulas = (this.plano.getLinhas() - 1) * this.plano.getColunas(); 
		
		if (this.quantidadeAlunos >= quantidadeCelulas / 2) {
			System.out.println("Quantidade de alunos maior que metadade da quantidade de celulas!");
			return;
		}
		
		if (quantidadeBugs >= quantidadeCelulas / 2) {
			System.out.println("Quantidade de bugs maior que metadade da quantidade de celulas!");
			return;		
		}
		
		this.setAlunoSorteado(quantidadeAlunos);
		this.setBugSorteado(quantidadeBugs);
				
		
		try {
			while (!this.todosAlunosResgatados()) {
				System.out.println(this.plano);
				
				for (RoboAbstrato robo : this.robos) {
					System.out.println("Movimente o robô " + robo.getNome());
					
					System.out.println();
					
					System.out.println("Ações:");
					System.out.println("1. Avançar");
					System.out.println("2. Retroceder");
					System.out.println("3. Sair");
					
					int acao = this.scanner.nextInt();
					
					if (acao == 3) {
						throw new Exception("Jogador decidiu sair..");
					}
					
					System.out.println();
					
					System.out.println("Quantidade máxima de movimentos: " + robo.getMaximoMovimento());
					System.out.println("Quantos movimentos serão executados?");
					
					int quantidadeMovimentos = this.scanner.nextInt();
						
					if (acao == 1) {
						if (!robo.avancar(quantidadeMovimentos)) {
							System.out.println(robo.getNome() + ", não conseguir avançar " + quantidadeMovimentos + " passo(s)!");
						}
						
					}
					
					if (acao == 2) {
						if (!robo.retroceder(quantidadeMovimentos)) {
							System.out.println(robo.getNome() + ", não conseguir retroceder " + quantidadeMovimentos + " passo(s)!");
						}
					}
					
					System.out.println(this.plano);
					
				}
				
				System.out.println();
				
				System.out.println("Alunos resgatados: " + this.getAlunosResgatados());
				System.out.println("Bugs encontrados: " + this.getBugsEncontrados());
				
				System.out.println();
				
				System.out.println(this.gerarRelatorioRodada());
				
			}
			
			System.out.println(this.gerarRelatorioFinal());
			
		} catch (Exception e) {
			System.out.println(this.gerarRelatorioFinal());
		}
		
	}
}
