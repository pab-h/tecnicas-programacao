package apresentacao.menutopo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import apresentacao.Relatorio;
import controle.Gerenciador;

public class CliqueNoRelatorio implements ActionListener {

	private Gerenciador gerenciador;
	
	public CliqueNoRelatorio(Gerenciador gerenciador) {
		this.gerenciador = gerenciador;
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(
			null, 
			new Relatorio(this.gerenciador), 
			"Relatorio", 
			JOptionPane.PLAIN_MESSAGE
		);
	}
	
}
