package questao18;

import java.util.Random;

public final class Jogo {

	private Robo robo;
	private Moeda moeda;
	private Plano plano;
	
	public void caminhadaA(){
		this.robo.mover(0, 0);
		System.out.println(this.plano);
		
		for (int k = 0; k < (int) (this.plano.getTamanho() / 2) + 1; k++) {
			for (int i = 0; i < this.plano.getTamanho(); i++) {
				this.robo.moverLeste();
				System.out.println(this.plano);
			}	
			
			this.robo.moverSul();
			System.out.println(this.plano);
			
			for (int i = this.plano.getTamanho(); i > 0; i--) {
				this.robo.moverOeste();
				System.out.println(this.plano);
			}		
			
			this.robo.moverSul();
			System.out.println(this.plano);
		}
	}
	
	public void caminhadaB() {
		this.robo.mover(0, 0);
		System.out.println(this.plano);
		
		while (this.robo.moverSudeste()) {
			System.out.println(this.plano);
		}
		
		while (this.robo.moverNorte()) {
			System.out.println(this.plano);
		}
		
		while (this.robo.moverSudoeste()) {
			System.out.println(this.plano);
		}
		
		while (this.robo.moverNorte()) {
			System.out.println(this.plano);
		}
		
	}
	
	public Jogo(int tamanho) {
		this.plano = new Plano(tamanho);
		
		int meio = (int) (tamanho / 2);
		
		Celula celulaMeio = this.plano.getCelula(meio, meio);
		
		this.robo = new Robo(plano, celulaMeio);
		
		Random random = new Random();
		
		int xSorteado = random.nextInt(tamanho);
		int ySorteado = random.nextInt(tamanho);
		
		Celula celulaMoeda = this.plano.getCelula(xSorteado, ySorteado); 

		Moeda moeda = new Moeda(celulaMoeda);
		this.moeda = moeda;
		
	}
	
	public void play() {
		while (!this.moeda.getCelulaAtual().equals(this.robo.getCelulaAtual())) {
			if (this.moeda.getCelulaAtual().getX() > this.robo.getCelulaAtual().getX()) {
				this.robo.moverSul();
				
				System.out.println(this.plano);
			}
			
			if (this.moeda.getCelulaAtual().getX() < this.robo.getCelulaAtual().getX()) {
				this.robo.moverNorte();
				
				System.out.println(this.plano);
			}
			
			if (this.moeda.getCelulaAtual().getY() > this.robo.getCelulaAtual().getY()) {
				this.robo.moverLeste();
				
				System.out.println(this.plano);
			}
			
			if (this.moeda.getCelulaAtual().getY() < this.robo.getCelulaAtual().getY()) {
				this.robo.moverOeste();
				
				System.out.println(this.plano);
			}
		}

		System.out.println("Robo achou a moeda!!!!");

//		caminhadaA();
//		caminhadaB();
	}
	
	
}
