package apresentacao.tabuleiro;

import java.util.ArrayList;

import java.awt.GridLayout;

import javax.swing.JPanel;

import controle.Gerenciador;

import controle.tabuleirovirtual.CelulaVirtual;
import controle.tabuleirovirtual.TabuleiroVirtual;

public class Tabuleiro extends JPanel{

	private ArrayList<ArrayList<Celula>> celulas;
	
	public Tabuleiro(Gerenciador gerenciador) {
		
		this.celulas = new ArrayList<ArrayList<Celula>>();
		
		TabuleiroVirtual tabuleiroVirtual = gerenciador.getTabuleiroVirtual();

		this.setLayout(new GridLayout(
			tabuleiroVirtual.getLinhas(), 
			tabuleiroVirtual.getColunas()
		));
		
		
		
		for(int i = 0; i < tabuleiroVirtual.getLinhas(); i++) {
			ArrayList<Celula> tmp = new ArrayList<Celula>();
			
			for(int j = 0; j < tabuleiroVirtual.getColunas(); j++) {
				CelulaVirtual celulaVirtual = tabuleiroVirtual.getCelulaVirtual(i, j);
				Celula celula = new Celula(gerenciador, celulaVirtual); 
				
				this.add(celula);
				tmp.add(celula);
			}
			
			this.celulas.add(tmp);
		}
		
		this.setVisible(true);
	}
	
	public Celula getCelula(int linha, int coluna) {
		return this.celulas.get(linha).get(coluna);
	}
	
}
