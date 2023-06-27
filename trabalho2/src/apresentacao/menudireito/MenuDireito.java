package apresentacao.menudireito;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import apresentacao.menudireito.aspiradoropcoes.AspiradoresOpcoes;
import controle.Gerenciador;

public class MenuDireito extends JPanel {

	public MenuDireito(Gerenciador gerenciador) {
		this.setLayout(new GridLayout(6, 1));
		
		JLabel pontuacaoLabel = new JLabel("-100", SwingConstants.CENTER);
		pontuacaoLabel.setFont(new Font("Roboto Mono", Font.BOLD, 50));
		this.add(pontuacaoLabel);
		
		this.add(new AspiradoresOpcoes(gerenciador));
		this.add(new PlacarEncontrados());
		
		JButton proximaRodadaButton = new JButton("Proxima Rodada");
		this.add(proximaRodadaButton);
		
		JButton sairButton = new JButton("Sair");
		this.add(sairButton);
		
		this.setVisible(true);	
	}
	
}
