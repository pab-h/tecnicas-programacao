package apresentacao.menudireito;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import apresentacao.Icone;

public class Contagem extends JPanel {

	private JLabel alunosEncontradosJLabel;
	private JLabel poeirasEncontradasJLabel;
	
	public Contagem() {
		this.setLayout(new FlowLayout());
		
		Icone iconeAluno = new Icone("./midia/aluno.png");
		
		this.add(new JLabel(iconeAluno.getIcon(50, 50)));
		
		this.alunosEncontradosJLabel = new JLabel("0");
		
		this.add(this.alunosEncontradosJLabel);
		
		Icone iconePoeira = new Icone("./midia/poeira.png");
		
		this.add(new JLabel(iconePoeira.getIcon(50, 50)));
		
		this.poeirasEncontradasJLabel = new JLabel("0");
		
		this.add(this.poeirasEncontradasJLabel);
		
	}
	
	public JLabel getAlunosEncontradosJLabel() {
		return this.alunosEncontradosJLabel;
	}
	
	public JLabel getPoeirasEncontradasJLabel() {
		return this.poeirasEncontradasJLabel;
	}
	
}
