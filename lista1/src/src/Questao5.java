package src;

public class Questao5 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10 ou se A 
		 * mais B é igual a 20, se verdade imprima: 
		 * "número válido". Caso as afirmações não 
		 * sejam verdadeiras, imprima: "número não 
		 * válido".
		 * */
		
		int A = 15;
		
		int B = 10;
		
		int soma = A + B;
		
		if (A > 10 || soma == 20) {
			System.out.println("número válido");
		} else {
			System.out.println("número não válido");
		}
	}
}
