package apresentacao.conteudos;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import apresentacao.conteudos.eventos.ActionClickAtualizar;

public class Atualizar extends JPanel {
	
	public Atualizar() {
		
		this.setLayout(new GridLayout(3, 1, 0, 10));

		this.add(new Campo("Matrícula: "));
		this.add(new Campo("Vertente: "));
		
		JButton atualizarButton = new JButton("Atualizar");
		
		atualizarButton.addActionListener(new ActionClickAtualizar());
		
		this.add(atualizarButton);
		
	}
	

	
}
