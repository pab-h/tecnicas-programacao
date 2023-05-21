package src;

public class Questao16 {
	
	public static boolean isPrimo(int valor) {
		int divisores = 0;
		
		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				divisores++;
			}
			
			if (divisores > 2) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um número inteiro 
		 * e verificar se ele é um número primo. 
		 * Exemplo: 7 -> True.
		 * */
		
		System.out.println(isPrimo(7));
	}
}
