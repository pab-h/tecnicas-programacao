package apresentacao.tabuleiro;

import java.awt.Color;

import javax.swing.JButton;

import controle.Gerenciador;
import controle.tabuleirovirtual.CelulaVirtual;

public class Celula extends JButton {

	private CelulaVirtual celulaVirtual;
	
	public Celula(Gerenciador gerenciador, CelulaVirtual celulaVirtual) {
		this.celulaVirtual = celulaVirtual;
		
		if ((celulaVirtual.getLinha() + celulaVirtual.getColuna()) % 2 != 0) {
			this.setBackground(Color.BLACK);
		}
		
		if ((celulaVirtual.getLinha() + celulaVirtual.getColuna()) % 2 == 0) {
			this.setBackground(Color.WHITE);
		}
		
		this.setBorderPainted(false);
		
		this.addActionListener(new CliqueNaCelula(gerenciador, this));
		
	}
	
	public CelulaVirtual getCelulaVirtual() {
		return this.celulaVirtual;
	}
	
}
