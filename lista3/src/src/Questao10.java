package src;

public class Questao10 {
	public static boolean isIgual(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		/* 
		 * Sua função deverá receber dois vetores 
		 * e verificar se eles são iguais, ou seja, 
		 * se possuem os mesmos elementos na mesma 
		 * ordem.
		 * */
		
		int[] a = { 1, 2, 3 };
		int[] b = { 3, 2, 1 };
		
		System.out.println(isIgual(a, b));
		
		int[] c = { 1, 2, 3 };
		int[] d = { 1, 2, 3 };
		
		System.out.println(isIgual(c, d));
		
	}
}
