package src;

public class Questao7 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10 ou se o A 
		 * mais B é igual a 20, caso sejam verdadeiras 
		 * as afirmações imprima: "números válidos”. 
		 * Caso a primeira afirmação não seja verdadeira, 
		 * imprima: "número não válido".
		 * */
		
		int A = 11;
		
		int B = 9;
		
		int soma = A + B;
		
		if (A > 10 || soma == 20) {
			System.out.println("números válidos");
		} 
		
		if (A <= 10) {
			System.out.println("número não válido");
		}
	}
}
