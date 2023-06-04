package apresentacao.conteudos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Atualizar extends JPanel {
	
	public Atualizar() {
		
		this.setLayout(new GridLayout(3, 1));

		this.add(new Campo("Matrícula: "));
		this.add(new Campo("Vertente: "));
		
		JButton atualizarButton = new JButton("Atualizar");
		
		atualizarButton.addActionListener(new ActionClickAtualizar());
		
		this.add(atualizarButton);
		
	}
	
	private class ActionClickAtualizar implements ActionListener {
		
		public void actionPerformed(ActionEvent evento) {
			System.out.println("atualizar Aluno");
		}
		
	}
	
}
