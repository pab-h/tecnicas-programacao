package src;

public class Questao3 {
	public static float mediaPonderada(float[] valores, float[] pesos) {
		float mediaPonderada = 0;
		
		for (int i = 0; i < valores.length; i++) {
			mediaPonderada += valores[i] * pesos[i];
		}
		
		float somaPesos = 0;
		
		for (int i = 0; i < pesos.length; i++) {
			somaPesos += pesos[i];
		}
		
		mediaPonderada /= somaPesos;
		
		return mediaPonderada;
	}
	
	public static void main(String[] args) {
		/*
		 * Média ponderada: Sua função deverá receber 
		 * um vetor de notas e um vetor de pesos 
		 * correspondentes. A função deve retornar 
		 * a média ponderada das notas. Exemplo: 
		 * [7, 8, 6], [2, 3, 1] -> 7.33
		 * */
		
		
		float[] valores = { 7, 8, 6 };
		float[] pesos = { 2, 3, 1 };
 		
		System.out.println(mediaPonderada(valores, pesos));
		
		
	}

}
