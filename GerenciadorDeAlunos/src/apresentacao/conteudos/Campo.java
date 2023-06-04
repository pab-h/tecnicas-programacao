package apresentacao.conteudos;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Campo extends JPanel{

	public Campo(String texto) {

		this.setLayout(new FlowLayout());
	
		this.add(new JLabel(texto));
		this.add(new JTextField(20));
	
	}
	
}
