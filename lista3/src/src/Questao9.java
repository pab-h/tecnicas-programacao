package src;

public class Questao9 {
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
				if(valoresCopia[j] < valoresCopia[j + 1]) {
					trocaValores(valoresCopia, j, j + 1);
				}
			}
		}
		
		return valoresCopia;
	}
	
	public static int kesimoMenorValor(int k , int[] valores) {
		int kesimoMaiorValor = -1;

		if (k > valores.length) {
			return kesimoMaiorValor;
		}
		
		int[] valoresOrdenados = bubbleSort(valores);
		
		kesimoMaiorValor = valoresOrdenados[k - 1];
		
		return kesimoMaiorValor;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um vetor 
		 * e um K e retornar o K-ésimo menor 
		 * valor presente no vetor.
		 * */
		
		int[] valores = { 10, 30, 20, 40, 50 };
		
		System.out.println(kesimoMenorValor(5, valores));
	}
}
