package src;

public class Questao15 {
	
	public static boolean isPalindromo(String texto) {
		char[] caracteres = texto.toCharArray();
		
		for (int i = 0, j = caracteres.length - 1; i < caracteres.length; i++, j--) {
			if (caracteres[i] != caracteres[j]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber uma string e 
		 * verificar se ela é um palíndromo, 
		 * ou seja, se pode ser lida da mesma 
		 * forma de trás para frente. Exemplo: 
		 * "ana" -> True.
		 * */
		
		System.out.println(isPalindromo("ana"));
		System.out.println(isPalindromo("java"));
		
	}
}
