package src;

public class Questao11 {
	public static float potencia(int base, int expoente) {
		float resultado = 1;
		
		if (expoente == 0) {
			return resultado;
		}
		
		if (expoente > 0) {
			for (int i = 0; i < expoente; i++) {
				resultado *= base;
			}			
		}
		
		if (expoente < 0) {
			for (int i = 0; i < -expoente; i++) {
				resultado *=  1 / (float) base;
			}			
		}
		
		return resultado;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber dois números, 
		 * a base e o expoente, e retornar a 
		 * potência da base elevada ao expoente.
		 * */
		
		int base = 2;
		int expoente = -3;
		
		System.out.println(potencia(base, expoente));
		
	}
}
