package apresentacao;

import java.util.Scanner;

public final class Terminal extends Apresentacao {

	public void mensagem(String msg) {
		System.out.println(msg);	
	}
	
	public String entradaDados(String msg) {
		Scanner entrada = new Scanner(System.in);
		
		this.mensagem(msg);
		String nome = entrada.nextLine();
		
		entrada.close();
		
		return nome;
	}

}
