package src;

public class Questao10 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10 se não for imprima: 
		 * "número menor que 10". Verifique se A mais B é 
		 * igual a 20 se não for verdade imprima "número 
		 * diferente de 20"
		 * */
		
		int A = 8;
		
		int B = 12;
		
		int soma = A + B;
		
		if (A <= 10) {
			System.out.println("número menor que 10");
		}
		
		if (soma != 20) {
			System.out.println("número diferente de 20");
		}
		
	}
}
