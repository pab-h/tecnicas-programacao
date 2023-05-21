package src;

public class Questao19 {
	
	public static boolean isNumeroPerfeito(int numero) {
		int quantidadeDivisores = 0;
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				quantidadeDivisores++;
			}
		}
		
		int[] divisores = new int[quantidadeDivisores];
		
		int indiceDivisores = 0;
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				divisores[indiceDivisores] = i;
				
				indiceDivisores++;
			}
		}
		
		int somaDivisores = 0;
		
		for (int i = 0; i < divisores.length; i++) {
			somaDivisores += divisores[i];
		}
		
		return somaDivisores == numero;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um número inteiro 
		 * e verificar se ele é um número perfeito, 
		 * ou seja, se a soma dos seus divisores 
		 * próprios é igual a ele mesmo. Exemplo: 
		 * 6 -> True
		 * */
		
		System.out.println(isNumeroPerfeito(6));
	}
}
