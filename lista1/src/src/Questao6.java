package src;

public class Questao6 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10, se verdade 
		 * imprima: "A > 10" caso não seja, imprima: 
		 * "A <= 10". Verifique se A mais B é igual 
		 * a 20, se verdadeiro, imprima: "A + B == 
		 * 20”, caso não seja imprima: “A + B != 20”.
		 * */
		
		int A = 10;
		
		int B = 10;
		
		int soma = A + B;
		
		if (A > 10) {
			System.out.println("A > 10");
		} else {
			System.out.println("A <= 10");
		}
		
		if (soma == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("A + B != 20");
		}
	}
}
