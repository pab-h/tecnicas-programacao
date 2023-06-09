package src;

public class Questao6 {
	public static void trocaValores(int[] valores, int x, int y) {
		int auxiliar = valores[x];
		valores[x] = valores[y];
		valores[y] = auxiliar;
		
	}
	
	public static int[] bubbleSort(int [] valores) {
		int[] valoresCopia = valores.clone();

		int tamanhoValores = valores.length;
		
		for(int i = 0; i < tamanhoValores; i++) {
			for(int j = 0; j < tamanhoValores - i - 1; j++) {
				if(valoresCopia[j] > valoresCopia[j + 1]) {
					trocaValores(valoresCopia, j, j + 1);
				}
			}
		}
		
		return valoresCopia;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um vetor e 
		 * retornar o vetor ordenado em ordem 
		 * crescente. Exemplo: [5, 2, 9, 1, 7] 
		 * -> [1, 2, 5, 7, 9]
		 * */
		
		int[] valores = { 5, 2, 9, 1, 7 };
		int[] valoresOrdenados = bubbleSort(valores);
		
	}
}
