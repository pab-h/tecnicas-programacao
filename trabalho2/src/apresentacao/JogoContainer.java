package apresentacao;


import java.awt.BorderLayout;

import javax.swing.JPanel;

import apresentacao.menudireito.MenuDireito;
import apresentacao.tabuleiro.Tabuleiro;
import controle.Gerenciador;

public class JogoContainer extends JPanel {

	public JogoContainer(Gerenciador gerenciador) {
		this.setLayout(new BorderLayout());
		
		Tabuleiro tabuleiro = new Tabuleiro(gerenciador);
		this.add(tabuleiro, BorderLayout.CENTER);
		this.add(new MenuDireito(gerenciador, tabuleiro), BorderLayout.EAST);
		
		this.setVisible(false);
	}
	
}
