package jogo;

import java.util.ArrayList;
import java.util.Scanner;

import plano.Plano;

public class Jogo {
	private String nomeJogador;
	private Scanner scanner;
	private Plano plano;
	private boolean estaRodando;
	
	public void setup() {
		this.scanner = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome, jogador?");
		this.nomeJogador = this.scanner.nextLine();
		
		System.out.println("Prazer, " + this.nomeJogador + "!");
		
		System.out.println("Quais são as dimensões do plano?");
		
		System.out.println("Altura: ");
		int alturaPlano = this.scanner.nextInt();
		
		System.out.println("Largura: ");
		int larguraPlano = this.scanner.nextInt();
		
		this.plano = new Plano(alturaPlano, larguraPlano);
		
		System.out.println("Quantos alunos perdidos teremos?");
		int alunos = this.scanner.nextInt();

		System.out.println("Quantos bugs teremos?");
		int bugs = this.scanner.nextInt();
		
		this.estaRodando = true;
	}
	
	public void run() {
		String comando = ""; 
		
		System.out.println("Para sair, digite 'sair'");

		while (this.estaRodando){
			System.out.println(this.plano);
			
			if (this.scanner.hasNextLine()) {
				System.out.println("Comando:");
				comando = this.scanner.nextLine();
			}
			
			if (comando.toLowerCase().equals("sair")) {
				this.estaRodando = false;
			}
			
		};
		
	}
}
