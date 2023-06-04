package apresentacao.conteudos;

import java.awt.GridLayout;

import javax.swing.JPanel;

public class Cadastrar extends JPanel {

	public Cadastrar() {
		this.setLayout(new GridLayout(4, 1));
		
		this.add(new Campo("Nome:"));
		this.add(new Campo("CPF:"));
		this.add(new Campo("Matrícula:"));
		this.add(new Campo("Vertente:"));
		
	}
	
}
