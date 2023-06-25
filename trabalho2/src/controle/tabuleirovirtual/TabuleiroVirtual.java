package controle.tabuleirovirtual;

import java.util.ArrayList;

public final class TabuleiroVirtual {

	private int linhas;
	private int colunas;
	private ArrayList<ArrayList<CelulaVirtual>> celulasVirtuais;
	
	public TabuleiroVirtual(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.celulasVirtuais = new ArrayList<ArrayList<CelulaVirtual>>();
		
		for(int i = 0; i < this.linhas; i++) {
			ArrayList<CelulaVirtual> tmp = new ArrayList<CelulaVirtual>();
			
			for (int j = 0; j < this.colunas; j++) {
				tmp.add(new CelulaVirtual(i, j));
			}
			
			this.celulasVirtuais.add(tmp);	
		}
		
	}

	public CelulaVirtual getCelulaVirtual(int linha, int coluna) {
		return this.getCelulasVirtuais().get(linha).get(coluna);
	}
	
	public int getLinhas() {
		return this.linhas;
	}

	public int getColunas() {
		return this.colunas;
	}

	public ArrayList<ArrayList<CelulaVirtual>> getCelulasVirtuais() {
		return this.celulasVirtuais;
	}
	
}
