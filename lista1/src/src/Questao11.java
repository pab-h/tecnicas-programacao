package src;

public class Questao11 {
	public static void main(String[] args) {
		/* 
		 * Verifique se A é maior que 10 se não for 
		 * verifique se A mais B é igual a 20, imprima: 
		 * "A + B == 20''. Caso A não seja maior que 10 
		 * e A mais B for diferente de 20, imprima: 
		 * "número não válido"
		 * */
		
		int A = 8;
		
		int B = 12;
		
		int soma = A + B;
		
		if (A <= 10 && soma == 20) {
			System.out.println("A + B == 20");
		}
		
		if (A <= 10 && soma != 20) {
			System.out.println("número não válido");
		}
		
	}
}
