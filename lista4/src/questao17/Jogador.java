package questao17;

public class Jogador {

	private String nome;
	private char simbolo;
	
	public Jogador(String nome, char simbolo) {
		this.nome = nome;
		this.simbolo = simbolo;
	
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
}
