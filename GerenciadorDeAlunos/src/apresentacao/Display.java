package apresentacao;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class Display extends JFrame {
	
	public Display() {
		super();

		this.setTitle("Gerenciador de alunos");
		this.setSize(600, 600);

		this.setLayout(new GridLayout(2, 1));
		
		Conteudo conteudo = new Conteudo();
		
		this.add(new Menu(conteudo));
		this.add(conteudo);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
