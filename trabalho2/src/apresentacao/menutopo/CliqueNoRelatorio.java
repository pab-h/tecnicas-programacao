package apresentacao.menutopo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import apresentacao.JogoContainer;
import apresentacao.Relatorio;

public class CliqueNoRelatorio implements ActionListener {

	private JogoContainer jogoContainer;
	
	public CliqueNoRelatorio(JogoContainer jogoContainer) {
		this.jogoContainer = jogoContainer;
	}

	public void actionPerformed(ActionEvent e) {
		this.jogoContainer.setConteudoRelatorio();
	}
	
}
