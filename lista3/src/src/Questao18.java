package src;

public class Questao18 {
	
	public static double jurosCompostos(double capital, double taxa, double periodo) {
		double montante = capital;
		
		for(int i = 1; i <= periodo; i++) {
			montante *= 1 + taxa;
		}
		
		return montante;
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber um valor inicial, 
		 * uma taxa de juros e um número de períodos. 
		 * A função deve retornar o valor final após 
		 * a aplicação dos juros compostos. 
		 * Exemplo: 1000, 0.05, 3 -> 1157.63
		 * */
		
		System.out.println(jurosCompostos(1000.0, 0.05, 3.0));
		
	}
}
