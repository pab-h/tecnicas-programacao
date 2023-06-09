package src;

public class Questao2 {
	
	public static float media(float a[], float b[]) {		
		float[] valoresUnidos = new float[a.length + b.length];
		
		System.arraycopy(a, 0, valoresUnidos, 0, a.length);
		System.arraycopy(b, 0, valoresUnidos, a.length, b.length);
		
		float media = 0;
		
		for(int i = 0; i < valoresUnidos.length; i++) {
			media += valoresUnidos[i];
		}
		
		media /= valoresUnidos.length;
		
		return media;
	}
	
	public static void main(String[] args) {
		/*
		 * Média: Sua função deverá receber dois 
		 * vetores como entrada e retornar a 
		 * média dos valores presentes nos vetores
		 * */
		
		float[] valoresA = { 1, 1, 1 };
		float[] valoresB = { 3, 3, 3 };

		System.out.println("Média dos valores A e B = "+ media(valoresA, valoresB));
		
	}
}
