package apresentacao.menuesquerdo;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuEsquerdo extends JPanel {

	public MenuEsquerdo() {
		this.setLayout(new GridLayout(6, 1));
		
		JLabel pontuacaoLabel = new JLabel("-100");
		pontuacaoLabel.setFont(new Font("Roboto Mono", Font.BOLD, 50));
		this.add(pontuacaoLabel);
		
		JButton proximaRodadaButton = new JButton("Proxima Rodada");
		this.add(proximaRodadaButton);
		
		JButton sairButton = new JButton("Sair");
		this.add(sairButton);
		
		this.setVisible(true);	
	}
	
}
