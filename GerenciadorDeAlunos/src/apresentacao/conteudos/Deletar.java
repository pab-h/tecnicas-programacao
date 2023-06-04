package apresentacao.conteudos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Deletar extends JPanel {
	
	public Deletar() {
		this.setLayout(new GridLayout(2, 1));

		this.add(new Campo("Matrícula: "));
		
		JButton deletarButton = new JButton("Deletar");
		
		deletarButton.addActionListener(new ActionClickDeletar());
		
		this.add(deletarButton);
		
		
	}
	
	
	private class ActionClickDeletar implements ActionListener {
		
		public void actionPerformed(ActionEvent evento) {
			System.out.println("Deletar Aluno");
		}
		
	}
	
}
