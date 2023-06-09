package src;

public class Questao6 {
	public static boolean isMatrizSimetrica(int[][] matriz) {
		int tamanho_linhas = matriz[0].length - 1; 
		
		for(int i = 0; i <= tamanho_linhas; i++) {
			int tamanho_colunas =  matriz[i].length - 1;
			
			for(int j = 0; j <= tamanho_colunas; j++) {
				int valor = matriz[i][j];
				int valorTransposta = matriz[j][i];

				if (valor != valorTransposta) {
					return false;
				}
				
			}
		}
		
		return true;
	}
	
	public static void imprimeMatriz(int[][] matriz) {
		int tamanho_linhas = matriz[0].length - 1; 
		
		for(int i = 0; i <= tamanho_linhas; i++) {
			int[] linha = matriz[i];
			int tamanho_colunas = linha.length - 1;
			
			for(int j = 0; j <= tamanho_colunas; j++) {
				int valor = linha[j];
				
				System.out.print(valor + "|");
				
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Escreva um programa que utilize uma 
		 * estrutura "if-else" para verificar 
		 * se uma matriz é simétrica (ou seja, 
		 * a matriz é igual à sua transposta).
		 * */
		
		int[][] matrizSimetrica = {
			{ 1, 0, 0 },
			{ 0, 1, 0 },
			{ 0, 0, 1 },
		};
		int[][] matrizNaoSimetrica = {
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 },				
		};

		System.out.println("A matriz: ");
		imprimeMatriz(matrizSimetrica);
	
		if (isMatrizSimetrica(matrizSimetrica)) {
			System.out.println("é simétrica!\n");
		} else {
			System.out.println("não é simétrica!\n");
		}
		
		System.out.println("A matriz: ");
		imprimeMatriz(matrizNaoSimetrica);
	
		if (isMatrizSimetrica(matrizNaoSimetrica)) {
			System.out.println("é simétrica!\n");
		} else {
			System.out.println("não é simétrica!\n");
		}		
		
		
	}
}
