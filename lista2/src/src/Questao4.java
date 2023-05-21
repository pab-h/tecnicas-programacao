package src;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que imprima a 
		 * tabela de multiplicação de um número 
		 * específico fornecido pelo usuário 
		 * usando um loop while.
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número específico:");
		
		int numero_especifico = scanner.nextInt();
		
		int i = 0;
		
		while (i <= 10) {
			System.out.println(i + " x " + numero_especifico + " = " + (i*numero_especifico));
			
			i++;
		}
		
		scanner.close();
		
	}
}
