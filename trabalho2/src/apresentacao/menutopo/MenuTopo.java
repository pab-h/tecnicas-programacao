package apresentacao.menutopo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import apresentacao.JogoContainer;
import controle.Gerenciador;

public class MenuTopo extends JPanel {

	public MenuTopo(Gerenciador gerenciador, JogoContainer jogoContainer) {
		this.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JLabel nomeLabel = new JLabel("Nome do Jogador");
		JTextField nomeField = new JTextField(15);
		
		JButton jogarButton = new JButton("Jogar");
		jogarButton.addActionListener(new CliqueEmJogar(gerenciador, nomeField, jogoContainer));
		
		JButton relatorioButton = new JButton("Relatorio do Jogo");
		relatorioButton.addActionListener(new CliqueNoRelatorio(gerenciador));
		
		this.add(nomeLabel);
		this.add(nomeField);
		this.add(jogarButton);
		this.add(relatorioButton);
		
	}
	
}
