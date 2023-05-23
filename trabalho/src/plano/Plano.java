package plano;

import java.util.ArrayList;

public class Plano {
	public int altura;
	public int largura;
	public ArrayList<ArrayList<Celula>> listaCelulas;

	public Plano(int largura, int altura) {
		this.largura = largura;
		this.altura = altura;
		
		this.listaCelulas = new ArrayList<ArrayList<Celula>>();
		
		int idAtual = 0;
		
		for(int i = 0; i < largura; i ++) {
			ArrayList<Celula> tmp = new ArrayList<Celula>();
			
			for(int j = 0; j < altura; j++) {
				tmp.add(new Celula(idAtual, i, j));
				
				idAtual++;
			}
			
			this.listaCelulas.add(tmp);
		}
	}

	public String toString() {
		String out = "";
		
		for (ArrayList<Celula> celulas : this.listaCelulas) {
			for (Celula celula : celulas) {
				out += "\t"+ celula;
			}
			
			out += "\n";
		}
		
		return out;
	}
	
	public void verificarSeTemRobo() {
//		for (int i = 0; i < listaCelulas.size(); i++) {
//			Celula aux = listaCelulas.get(i);
//			if (listaCelulas.get(i).robo != null) {
//				System.out.println("tem robo" + aux.robo.nome + "  - x: " + aux.posicaoX + "  - y: " + aux.posicaoY);
//			}
//		}
	}


	public Celula retornarCelula(int x, int y) {
//
//		for (int i = 0; i < listaCelulas.size(); i++) {
//			if (listaCelulas.get(i).posicaoX == x && listaCelulas.get(i).posicaoY == y) {
//				return listaCelulas.get(i);
//			}
//		}
		return null;
	}

	public void retornarCelulas() {
//		for (int i = 0; i < listaCelulas.size(); i++) {
//			System.out.println(listaCelulas.get(i).imprimir());
//		}
	}

}
