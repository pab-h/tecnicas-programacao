package src;

import java.util.Scanner;

public class Questao7 {
	public static boolean isPrimo(int numero) {
		int quantidade_divisores = 1;
		
		int i = 2;
		
		while (i <= numero) {
			if (numero % i == 0) {
				quantidade_divisores ++;
			}
			
			if (quantidade_divisores > 2) {
				return false;
			}
			
			i++;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		/*
		 * Crie um programa que use um loop "while" 
		 * para encontrar o maior número primo que 
		 * é menor do que um número fornecido pelo 
		 * usuário.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int numero_digitado = scanner.nextInt() - 1;
		
		while (!isPrimo(numero_digitado)) {
			numero_digitado--;
		}
		
		System.out.println("Número primo antecessor: " + numero_digitado);
		
		scanner.close();
		
	}
}
