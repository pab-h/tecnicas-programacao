package src;

public class Questao9 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10 e verifique 
		 * se A mais B é igual a 20, se verdadeiro, 
		 * imprima: "A + B == 20''. Caso as afirmações 
		 * não forem verdadeiras imprima: "número não 
		 * válido"
		 * */
		
		int A = 8;
		
		int B = 12;
		
		int soma = A + B;
		
		if (A > 10 && soma == 20) {
			System.out.println("A + B == 20");
		} else {
			System.out.println("número não válido");
		}
	}
}
