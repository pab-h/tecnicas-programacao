package src;

public class Questao5 {
	public static int[] copiaVetor(int[] vetor) {
		int[] copia = new int[vetor.length];
		
		for (int i = 0; i < vetor.length; i++) {
			copia[i] = vetor[i];
		}
		
		return copia;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um vetor 
		 * e retornar uma cópia exata desse 
		 * vetor.
		 * */
		
		int[] vetor = { 1, 2, 3 };
		int[] copia = copiaVetor(vetor);
		
	}
}
