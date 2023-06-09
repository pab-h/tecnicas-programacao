package src;

public class Questao7 {
	
	public static boolean isOrdenado(int[] valores) {
		for (int i = 0; i < valores.length - 1; i++) {
			if (valores[i] > valores[i + 1]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um vetor e 
		 * verificar se ele está ordenado em 
		 * ordem crescente. Se sim retornar true.
		 * */
		
		int[] valoresCrescentes = { 1, 2, 3, 4 };
		int[] valoresDecrescentes = { 4, 3, 2, 1 };
		
		System.out.println(isOrdenado(valoresCrescentes));
		System.out.println(isOrdenado(valoresDecrescentes));
		
	}
}
