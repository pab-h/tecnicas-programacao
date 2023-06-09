package src;

public class Questao17 {
	
	public static String inverteString(String texto) {
		char[] caracteres = texto.toCharArray();
		char[] caractesInvertidos = new char[caracteres.length];
		
		for (int i = 0, j = caracteres.length - 1; i < caracteres.length; i++, j--) {
			caractesInvertidos[i] = caracteres[j];
		}
		
		return new String(caractesInvertidos);
	}
	
	public static void main(String[] args) {
		/*
		 * Sua função deverá receber uma string 
		 * e retornar a mesma string invertida. 
		 * Exemplo: "hello" -> "olleh".
		 * */
		
		System.out.println(inverteString("Hello"));
	}
}
