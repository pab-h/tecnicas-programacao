package src;

public class Questao8 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10, se verdade 
		 * imprima: "A > 10" e verifique se A mais B 
		 * é igual a 20, se verdadeiro, imprima: 
		 * "A + B == 20” se não for verdade: imprima 
		 * "número não válido "
		 * */
		
		int A = 11;
		
		int B = 9;
		
		int soma = A + B;
		
		if (A > 10) {
			System.out.println("A > 10");
		} 
		
		if (soma == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}
		
	}
}
