package negocio;

import apresentacao.Apresentacao;
import apresentacao.Tela;
import apresentacao.Terminal;

import java.util.Random;

public class Jogo {

	private Jogador jogador;
	private Apresentacao gui;
	private int numeroSorteado;
	private boolean jogando;


	public Jogo() {
		this.jogador = new Jogador();
		this.atualizarNumeroSorteado();;
		this.jogando = true;
		
	}

	public void iniciarJogoTerminal() {
		this.gui = new Terminal();
		
		this.jogar();
		
	}

	public void iniciarJogoGUI() {
		this.gui = new Tela();
		
		this.jogar();
		
	}
	
	private void atualizarNumeroSorteado() {
		this.numeroSorteado = (new Random()).nextInt(100);
	}

	private void solicitarNumero() {
		String temporario = this.gui.entradaDados("Tente a sorte. Digite um número:");
		
		try {
			int numeroApostado = Integer.parseInt(temporario);
			
			this.jogador.setUltimoNumeroApostado(numeroApostado);
			
		} catch (Exception e) {
			this.jogador.setUltimoNumeroApostado(-1);
		}
		
	}

	public void jogar() {
	
		this.gui.mensagem("Bem vindo ao jogo de acertar o número!");
		
		this.jogador.setNome(this.gui.entradaDados("Qual é o seu nome?"));
		this.gui.mensagem("Seja bem vindo: " + jogador.getNome());
		
		while (this.jogando) {
			this.solicitarNumero();
			
			if (this.verificarMenor()) {
				this.gui.mensagem(this.jogador.getNome() + ", o número sorteado é menor!\nTentativas:" + this.jogador.getNumeroTentativa());

			} 
			
			if (this.verificarMaior()) {
				this.gui.mensagem(this.jogador.getNome() + ", o número sorteado é maior!\nTentativas:" + this.jogador.getNumeroTentativa());

			}
			
			if (this.verificarAcerto()) {
				this.gui.mensagem("Parabéns, " + this.jogador.getNome() +"!Você acertou!!\nTentativas: " + this.jogador.getNumeroTentativa() + "\n Números tentados: " + this.jogador.getListaNumeros());
				this.jogando = false;
			}

			
		}
		
		this.fimDoJogo();
		
	}

	private void fimDoJogo() {
		this.gui.mensagem("Obrigado por jogar!");
		
	}

	private boolean verificarMenor() {
		return this.numeroSorteado < this.jogador.getUltimoNumeroApostado();
	}
	
	private boolean verificarMaior() {
		return this.numeroSorteado > this.jogador.getUltimoNumeroApostado();
	}

	private boolean verificarAcerto() {
		return this.numeroSorteado == this.jogador.getUltimoNumeroApostado();
	}
}
