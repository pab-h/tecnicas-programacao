package apresentacao.conteudos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import apresentacao.conteudos.eventos.ActionClickDeletar;

public class Deletar extends JPanel {
	
	public Deletar() {
		this.setLayout(new GridLayout(2, 1, 0, 10));

		this.add(new Campo("Matrícula: "));
		
		JButton deletarButton = new JButton("Deletar");
		
		deletarButton.addActionListener(new ActionClickDeletar());
		
		this.add(deletarButton);
		
	}
	
}
