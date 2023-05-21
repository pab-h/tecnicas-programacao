package src;

public class Questao14 {
	
	public static int[] removeElemento(int elemento, int[] vetor) {		
		int ocorrencias = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (elemento == vetor[i]) {
				ocorrencias++;
			}
		}
		
		int[] resultado = new int[vetor.length - ocorrencias];
		
		int ultimoIndice = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			if (elemento != vetor[i]) {
				resultado[ultimoIndice] = vetor[i];
				ultimoIndice++;
			}
		}
			
		
		return resultado;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um vetor 
		 * e um elemento a ser removido. A 
		 * função deve remover todas as ocorrências 
		 * desse elemento no vetor. Um novo vetor, 
		 * apenas com elementos mantindos, deve ser 
		 * retornado: Exemplo: [1, 2, 3, 2, 4], 2 -> 
		 * [1, 3, 4]
		 * */
		
		int[] vetor = { 1, 2, 2, 3, 3 };
		
		int[] vetorSem2 = removeElemento(2, vetor);
		
	}
}
