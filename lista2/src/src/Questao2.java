package src;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que leia uma sequência 
		 * de números do usuário e pare a leitura quando 
		 * o usuário digitar um número negativo. Em seguida, 
		 * o programa deve imprimir a soma dos números 
		 * positivos lidos.
		 * */	
		
		Scanner scanner = new Scanner(System.in);
		
		float acumulado = 0;

		float numero_atual = scanner.nextFloat();
		
		while(numero_atual >= 0) {
			acumulado += numero_atual;
			numero_atual = scanner.nextFloat();
		}
		
		System.out.println("Soma total: " + acumulado);
		
		scanner.close();
		
	}
}
