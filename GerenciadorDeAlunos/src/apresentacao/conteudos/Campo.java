package apresentacao.conteudos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Campo extends JPanel{
	
	private JLabel label;
	private JTextField textField;

	public Campo(String texto) {

		this.setLayout(new BorderLayout());
	
		this.label = new JLabel(texto);
		this.textField = new JTextField(20);
		
		this.add(this.label, BorderLayout.WEST);
		this.add(this.textField, BorderLayout.EAST);
	
	}
	
	public String getValor() {
		return this.textField.getText().trim();
	}
	
	public void limpaValor() {
		this.textField.setText("");
	}

	public boolean valorVazio() {
		return this.getValor() == "";
	}
	
}
