package questao17;

import java.util.Scanner;

public class JogoDaVelha {

	private Tabuleiro tabuleiro;
	private Jogador jogadorA;
	private Jogador jogadorB;
	private Jogador jogadorGanhador;
	private Scanner leitor;
	
	public JogoDaVelha() {
		this.leitor = new Scanner(System.in);
		
		System.out.println("Qual é o nome do primeiro Jogador?");
		this.jogadorA = new Jogador(this.leitor.nextLine(), 'X');
		System.out.println(this.jogadorA.getNome() + ", você será X!");
		
		System.out.println("Qual é o nome do segundo Jogador?");
		this.jogadorB = new Jogador(this.leitor.nextLine(), 'O');
		System.out.println(this.jogadorB.getNome() + ", você será O!");
		
		this.tabuleiro = new Tabuleiro(3, 3);
		
	}
	
	public void setJogada(Jogador jogador, int linha, int coluna) {
		try {
			if (this.tabuleiro.getSimbolo(linha, coluna) == ' ') {
				this.tabuleiro.setSimboloEm(linha, coluna, jogador.getSimbolo());
			}			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Não seja espertinho! Perdeu a vez!");
		}
	}
	
	private boolean haJogadorGanhador() {
		return this.jogadorGanhador != null;
	}
	
	private void setJogadorGanhador() {
		char[][] grid = this.tabuleiro.getGrid();
		
		for(int i = 0; i < this.tabuleiro.getLinhas(); i ++) {
			if (this.tabuleiro.linhaComSimbolosIguais(i)) {
				char simboloLinha = grid[i][0];
				
				if (simboloLinha == this.jogadorA.getSimbolo()) {
					this.jogadorGanhador = this.jogadorA;
				}
				
				if (simboloLinha == this.jogadorB.getSimbolo()) {
					this.jogadorGanhador = this.jogadorB;
				}
			}
		}
		
		for (int j = 0; j < this.tabuleiro.getColunas(); j++) {
			if (this.tabuleiro.colunaComSimbolosIguais(j)) {
				char simboloColuna = grid[0][j];
				
				if (simboloColuna == this.jogadorA.getSimbolo()) {
					this.jogadorGanhador = this.jogadorA;
				}
				
				if (simboloColuna == this.jogadorB.getSimbolo()) {
					this.jogadorGanhador = this.jogadorB;
				}
			}
		}
		
		if (this.tabuleiro.diagonalPrincipalComSimbolosIguais()) {
			char simboloDiagonal = grid[0][0];
			
			if (simboloDiagonal == this.jogadorA.getSimbolo()) {
				this.jogadorGanhador = this.jogadorA;
			}
			
			if (simboloDiagonal == this.jogadorB.getSimbolo()) {
				this.jogadorGanhador = this.jogadorB;
			}
		}
		
		if (this.tabuleiro.diagonalSecundariaComSimbolosIguais()) {
			char simboloDiagonalSecundaria = grid[0][this.tabuleiro.getColunas() - 1];
			
			if (simboloDiagonalSecundaria == this.jogadorA.getSimbolo()) {
				this.jogadorGanhador = this.jogadorA;
			}
			
			if (simboloDiagonalSecundaria == this.jogadorB.getSimbolo()) {
				this.jogadorGanhador = this.jogadorB;
			}
		}
	}
	
	public void play() {
	
		int linha = 0;
		int coluna = 0;

		
		do {
			System.out.println(this.tabuleiro);

			System.out.println(this.jogadorA.getNome() + ", é a sua vez!");
			
			System.out.println("linha: ");
			linha = this.leitor.nextInt();
			
			System.out.println("coluna: ");
			coluna = this.leitor.nextInt();
			
			this.setJogada(jogadorA, linha - 1, coluna - 1);

			System.out.println(this.tabuleiro);

			System.out.println(this.jogadorB.getNome() + ", é a sua vez!");
			
			System.out.println("linha: ");
			linha = this.leitor.nextInt();
			
			System.out.println("coluna: ");
			coluna = this.leitor.nextInt();
			
			this.setJogada(this.jogadorB, linha - 1, coluna - 1);
			
			System.out.println(this.tabuleiro);
			
			this.setJogadorGanhador();
			
			if (this.haJogadorGanhador()) {
				System.out.println("Parabéns, "+ this.jogadorGanhador.getNome() +"! Você ganhou!!!");
			}
		
		} while (!this.tabuleiro.tabuleiroCheio() && !this.haJogadorGanhador());
		
	}
	
}
