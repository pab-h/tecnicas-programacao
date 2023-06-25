package controle;

public class Jogador {

	private String nome;
	private int pontuacao;
	
	public Jogador(String nome) {
		this.nome = nome;
		this.pontuacao = 0;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPontuacao() {
		return this.pontuacao;
	}

	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	

	
}
