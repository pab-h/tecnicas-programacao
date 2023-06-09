package src;

public class Questao13 {
	public static int[] intersercao(int[] a, int[] b) {			
		int ocorrencias = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					ocorrencias++;
				}
			}
		}
		
		int indiceResultado = 0;
		
		int[] resultado = new int[ocorrencias];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					resultado[indiceResultado] = a[i];
					
					indiceResultado++;
				}
			}
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber dois vetores 
		 * e deverá retornar um novo vetor com 
		 * todos os elementos que aparecem em 
		 * ambos os vetores.
		 * */
		
		int[] a = { 5, 2 };
		int[] b = { 5, 2, 6 };
		
		System.out.println(intersercao(a, b));
	}
}
