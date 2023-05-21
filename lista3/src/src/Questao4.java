package src;

public class Questao4 {
	public static int contagemElemento(float elemento, float[] a, float[] b) {
		float[] valoresUnidos = new float[a.length + b.length];
		
		System.arraycopy(a, 0, valoresUnidos, 0, a.length);
		System.arraycopy(b, 0, valoresUnidos, a.length, b.length);
		
		int ocorrencias = 0;
		
		for(int i = 0; i < valoresUnidos.length; i++) {
			if (elemento == valoresUnidos[i]) {
				ocorrencias++;
			}
		}
		
		return ocorrencias;
	}
	
	public static void main(String[] args) {
		/*
		 * Contagem de elementos: Sua função deverá 
		 * receber dois vetores e um elemento a ser 
		 * contado. A função deve retornar a 
		 * quantidade de vezes que esse elemento 
		 * aparece nos vetores. Exemplo: [1,3, 3, 2, 5],
		 * [1, 2, 3, 2, 4], 2 -> 3
		 * */

		float[] a = { 1, 3, 3, 2, 5 };
		float[] b = { 1, 2, 3, 2, 4 };
		
		System.out.println("2 -> " + contagemElemento(2, a, b));
		System.out.println("5 -> " + contagemElemento(5, a, b));

	}
}
