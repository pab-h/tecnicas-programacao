package apresentacao;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import apresentacao.menudireito.MenuDireito;
import apresentacao.tabuleiro.Tabuleiro;

import controle.Gerenciador;

public class JogoContainer extends JPanel {

	private Gerenciador gerenciador;
	
	public JogoContainer(Gerenciador gerenciador) {
		this.setLayout(new BorderLayout());
		this.gerenciador = gerenciador;
		
		Tabuleiro tabuleiro = new Tabuleiro(this.gerenciador);
		
		this.add(tabuleiro, BorderLayout.CENTER);
		this.add(new MenuDireito(this.gerenciador, tabuleiro), BorderLayout.EAST);
		
		this.setVisible(false);
	}
	
}
