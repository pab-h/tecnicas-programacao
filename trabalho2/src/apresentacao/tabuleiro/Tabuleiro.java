package apresentacao.tabuleiro;

import java.awt.GridLayout;

import javax.swing.JPanel;

import controle.Gerenciador;

import controle.tabuleirovirtual.CelulaVirtual;
import controle.tabuleirovirtual.TabuleiroVirtual;

public class Tabuleiro extends JPanel{

	public Tabuleiro(Gerenciador gerenciador) {
		
		TabuleiroVirtual tabuleiroVirtual = gerenciador.getTabuleiroVirtual();

		this.setLayout(new GridLayout(
			tabuleiroVirtual.getLinhas(), 
			tabuleiroVirtual.getColunas()
		));
		
		
		for(int i = 0; i < tabuleiroVirtual.getLinhas(); i++) {
			for(int j = 0; j < tabuleiroVirtual.getColunas(); j++) {
				CelulaVirtual celulaVirtual = tabuleiroVirtual.getCelulaVirtual(i, j);
				this.add(new Celula(gerenciador, celulaVirtual));
			}
		}
		
		this.setVisible(true);
	}
	
}
