package src;

public class Questao3 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é igual a 10, se verdade imprima:
		 * "A == 10", e verifiquese o A mais B é igual a 20, 
		 * se verdade imprima: "A + B == 20". verifique se o 
		 * B é igual a 10, se verdade imprima: "B == 10", 
		 * (obs: todas as três impressões são permitidas na 
		 * saída do programa).
		 * */
		
		int A = 10;
		
		int B = 10;
		
		int soma = A + B;
		
		if (A == 10) {
			System.out.println("A == 10");
		}
		
		if (soma == 20) {
			System.out.println("A + B == 20");
		} 
		
		if (B == 10){
			System.out.println("B == 10");
		}

	}
}
