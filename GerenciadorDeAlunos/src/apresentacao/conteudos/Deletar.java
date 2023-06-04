package apresentacao.conteudos;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Deletar extends JPanel {
	
	public Deletar() {
		this.setLayout(new GridLayout(1, 1));

		this.add(new Campo("Matrícula: "));
		
	}
	
}
