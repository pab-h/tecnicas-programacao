package src;

import java.util.Random;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		/*
		 * Escreva um programa que peça ao usuário 
		 * para adivinhar um número entre 1 e 100. 
		 * Se o usuário adivinhar incorretamente, 
		 * o programa deve dizer se o número a ser 
		 * adivinhado é maior ou menor do que o número 
		 * digitado pelo usuário. O programa deve continuar 
		 * a pedir ao usuário que adivinhe até que ele 
		 * adivinhe corretamente
		 * */
		
		Random random = new Random();		
		
		int numero_randomico = random.nextInt((100 - 1) + 1) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		int numero_digitado = 0;
		System.out.println(numero_randomico);
		do {
			System.out.println("Digite um número: ");
			numero_digitado = scanner.nextInt();
			
			if (numero_digitado > numero_randomico) {
				System.out.println("O número "+ numero_digitado + " é maior que o sorteado!");
			}
			
			if (numero_digitado < numero_randomico) {
				System.out.println("O número "+ numero_digitado + " é menor que o sorteado!");
			}
			
		} while (numero_digitado != numero_randomico);
		
		System.out.println("Parabéns! Você acertou!");
		
		scanner.close();
		
	}
}
