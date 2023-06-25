package apresentacao;


import java.awt.BorderLayout;

import javax.swing.JPanel;

import apresentacao.menuesquerdo.MenuEsquerdo;
import apresentacao.tabuleiro.Tabuleiro;
import controle.Gerenciador;

public class JogoContainer extends JPanel {

	public JogoContainer(Gerenciador gerenciador) {
		this.setLayout(new BorderLayout());
		
		this.add(new Tabuleiro(gerenciador), BorderLayout.CENTER);
		this.add(new MenuEsquerdo(), BorderLayout.EAST);
		
		this.setVisible(false);
	}
	
}
