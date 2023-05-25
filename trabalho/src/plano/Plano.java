package plano;

import java.util.ArrayList;

public class Plano {
	public int largura;
	public int altura;
	public ArrayList<ArrayList<Celula>> celulas;

	public Plano(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		
		this.celulas = new ArrayList<ArrayList<Celula>>();
		
		for(int i = 0; i < largura; i ++) {
			ArrayList<Celula> tmp = new ArrayList<Celula>();
			
			for(int j = 0; j < altura; j++) {
				tmp.add(new Celula(i, j));
				
			}
			
			this.celulas.add(tmp);
		}
	}
	
	public Celula getCelula(int linha, int coluna) {
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
