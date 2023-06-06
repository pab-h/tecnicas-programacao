package apresentacao;

import java.awt.BorderLayout;
//import java.awt.GridLayout;

import javax.swing.JFrame;

public class Display extends JFrame {
	
	public Display() {
		super();

		this.setTitle("Gerenciador de alunos");
		this.setSize(600, 600);
		this.setLayout(new BorderLayout(0, 100));
		this.setResizable(false);
		
		Conteudo conteudo = new Conteudo();
		
		this.add(new Menu(conteudo), BorderLayout.NORTH);
		this.add(conteudo, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
}
