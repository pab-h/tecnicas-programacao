package src;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual o limite esquerdo?");
		int limite_esquerdo = scanner.nextInt();
		
		System.out.println("Qual o limite direito?");
		int limite_direito = scanner.nextInt();
		
		for(int i = 0; i <= limite_esquerdo; i++) {
			for(int j = 0; j <= limite_direito; j++) {
				System.out.println(i + " - " + j);
			}
		}
		
		scanner.close();
	}
}
