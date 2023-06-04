package apresentacao.conteudos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Cadastrar extends JPanel {

	public Cadastrar() {
		this.setLayout(new GridLayout(5, 1));
		
		this.add(new Campo("Nome:"));
		this.add(new Campo("CPF:"));
		this.add(new Campo("Matrícula:"));
		this.add(new Campo("Vertente:"));
		
		JButton cadastrarButton = new JButton("Cadastrar");
		
		cadastrarButton.addActionListener(new ActionClickCadastrar());
		
		this.add(cadastrarButton);
		
	}
	
	private class ActionClickCadastrar implements ActionListener {
		
		public void actionPerformed(ActionEvent evento) {
			System.out.println("Cadastrar Aluno");
		}
		
	}
	
}
