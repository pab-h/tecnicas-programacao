package plano;

import java.util.ArrayList;

public class Plano {
	private int linhas;
	private int colunas;
	private ArrayList<ArrayList<Celula>> celulas;

	public Plano(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		
		this.celulas = new ArrayList<ArrayList<Celula>>();
		
		for(int i = 0; i < this.linhas; i ++) {
			ArrayList<Celula> tmp = new ArrayList<Celula>();
			
			for(int j = 0; j < this.colunas; j++) {
				tmp.add(new Celula(i, j));
				
			}
			
			this.celulas.add(tmp);
		}
	}
	
	public int getLinhas() {
		return this.linhas;
	}
	
	public int getColunas() {
		return this.colunas;
	}
	
	public Celula getCelula(int linha, int coluna) throws ArrayIndexOutOfBoundsException {
		return this.celulas.get(linha).get(coluna);
	}

	public String toString() {
		String out = "";
		
		for (ArrayList<Celula> celulas : this.celulas) {
			for (Celula celula : celulas) {
				out += "\t"+ celula;
			}
			
			out += "\n";
		}
		
		return out;
	}
	
}
