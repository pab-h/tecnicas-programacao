package src;

public class Questao1 {
	public static float somatorio(float[] valores) {
		float resultado = 0;
		
		if (valores.length <= 2) {
			return resultado;
		}
		
		for (int i = 2; i < valores.length - 2; i++) {
			resultado += valores[i];
		}
		
		return resultado;
	}
	public static void main(String[] args) {
		/*
		 * Somatório: Sua função deverá receber 
		 * um vetor como parâmetro e retornar 
		 * a soma de todos elementos do vetor, 
		 * sendo que as primeiras duas e as 
		 * últimas posições do vetor de entrada 
		 * não devem ser consideradas;
		 * */
		
		float[] valoresA = { 1, 2 };
		
		System.out.println("Somatório dos valores A: " + somatorio(valoresA));
		
		float[] valoresB = { 1, 2, 1, 1, 1 };
		
		System.out.println("Somatório dos valores B: " + somatorio(valoresB));
		
	}
}
