package apresentacao.menudireito;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		Contagem contagem = new Contagem(); 
		this.add(contagem);

		AspiradoresOpcoes aspiradoresOpcoes = new AspiradoresOpcoes(gerenciador);
		this.add(aspiradoresOpcoes);
		
		JButton proximaRodadaButton = new JButton("Proxima Rodada");
		proximaRodadaButton.addActionListener(new CliqueEmProximaRodada(
			gerenciador, 
			tabuleiro,
			pontuacaoLabel,
			contagem,
			aspiradoresOpcoes
			
		));
		this.add(proximaRodadaButton);
		
		JButton sairButton = new JButton("Sair");
		sairButton.addActionListener(new Sair(gerenciador));
		this.add(sairButton);
		
		this.setVisible(true);	
	}
	
}
