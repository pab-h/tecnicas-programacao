package src;

public class Questao12 {
	public static void main(String[] args) {
		/*
		 * Verifique se A é maior que 10 imprima: 
		 * "A > 10" ou verifique se A mais B é igual 
		 * a 20, imprima: "A + B == 20'', caso as 
		 * afirmações não sejam verdadeiras, imprima: 
		 * "números não válidos". Sejam as afirmações 
		 * anteriores falsas ou verdadeiras imprima: 
		 * “Sejam bem-vindos à disciplina de Técnicas 
		 * de Programação”.
		 * */
		
		int A = 8;
		
		int B = 12;
		
		int soma = A + B;
		
		if (A > 10) {
			System.out.println("A > 10");
		}
		
		if (soma == 20) {
			System.out.println("A + B == 20");
		}
		
		if (A <= 10 && soma != 20) {
			System.out.println("números não válidos");
		}
		
		System.out.println("Sejam bem-vindos à disciplina de Técnicas de Programação");
		
	}
}
