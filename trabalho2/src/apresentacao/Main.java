package apresentacao;

import controle.Gerenciador;

public class Main {

	public static void main(String[] args) {
		Gerenciador jogo = new Gerenciador();
		new Tela(jogo);
	}
	
}
