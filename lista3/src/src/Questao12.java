package src;

public class Questao12 {
	
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
		 * Sua função deverá receber um número 
		 * inteiro e verificar se ele é primo, 
		 * ou seja, se é divisível apenas por 
		 * 1 e por ele mesmo.
		 * */
		
		System.out.println(isPrimo(1));
		System.out.println(isPrimo(2));
		System.out.println(isPrimo(4));
	}
}
