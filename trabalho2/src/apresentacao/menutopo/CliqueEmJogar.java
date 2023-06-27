package apresentacao.menutopo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import apresentacao.JogoContainer;
import controle.Gerenciador;
import controle.Jogador;

public class CliqueEmJogar implements ActionListener {

	private Gerenciador gerenciador;
	private JTextField nomeField;
	private JogoContainer jogoContainer;
	
	public CliqueEmJogar(Gerenciador gerenciador, JTextField nomeField, JogoContainer jogoContainer) {
		this.gerenciador = gerenciador;
		this.nomeField = nomeField;
		this.jogoContainer = jogoContainer;
	}

	public void actionPerformed(ActionEvent e) {
		if (this.nomeField.getText().trim().equals("")) {
			JOptionPane.showMessageDialog(
				null, 
				"Preencha o nome do jogador!", 
				"Error", 
				JOptionPane.ERROR_MESSAGE
			);
			
			return;
		}
		
		this.gerenciador.setJogador(new Jogador(this.nomeField.getText().trim()));
		
		this.jogoContainer.setVisible(true);
		
		
	}

}
