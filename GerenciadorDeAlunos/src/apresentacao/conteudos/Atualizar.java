package apresentacao.conteudos;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Atualizar extends JPanel {
	
	public Atualizar() {
		
		this.setLayout(new GridLayout(2, 1));

		this.add(new Campo("Matrícula: "));
		this.add(new Campo("Vertente: "));
		
	}
	
}
