package apresentacao.menudireito;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import apresentacao.menudireito.aspiradoropcoes.AspiradoresOpcoes;
import apresentacao.tabuleiro.Tabuleiro;

import controle.Gerenciador;

public class MenuDireito extends JPanel {

	public MenuDireito(Gerenciador gerenciador, Tabuleiro tabuleiro) {
		this.setLayout(new GridLayout(6, 1));
		
		JLabel pontuacaoLabel = new JLabel("0", SwingConstants.CENTER);
		pontuacaoLabel.setFont(new Font("Roboto Mono", Font.BOLD, 50));
		this.add(pontuacaoLabel);
		
		this.add(new AspiradoresOpcoes(gerenciador));
		this.add(new PlacarEncontrados());
		
		JButton proximaRodadaButton = new JButton("Proxima Rodada");
		proximaRodadaButton.addActionListener(new CliqueEmProximaRodada(
			gerenciador, 
			tabuleiro,
			pontuacaoLabel
		));
		this.add(proximaRodadaButton);
		
		JButton sairButton = new JButton("Sair");
		this.add(sairButton);
		
		this.setVisible(true);	
	}
	
}
