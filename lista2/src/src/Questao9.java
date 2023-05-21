package src;

public class Questao9 {
    public static void trocaSimbolos(char[] simbolos, int i, int j) {
        char temp = simbolos[i];
        simbolos[i] = simbolos[j];
        simbolos[j] = temp;
    }
	
    // Referencia: https://pt.wikipedia.org/wiki/Algoritmo_de_Heap    	
    public static void algoritmoHeap(char[] simbolos, int tamanho) {
        if (tamanho == 1) { 
            System.out.println(new String(simbolos));
            return;
        }

        for (int i = 0; i < tamanho; i++) {
        	algoritmoHeap(simbolos, tamanho - 1);

            if (tamanho % 2 == 0) {
            	trocaSimbolos(simbolos, i, tamanho - 1);
            } else {
            	trocaSimbolos(simbolos, 0, tamanho - 1);
            }
        }
    }

    public static void main(String[] args) {
        String texto = "ABC";
        char[] simbolos = texto.toCharArray();
        
        algoritmoHeap(simbolos, simbolos.length);
    }
}

