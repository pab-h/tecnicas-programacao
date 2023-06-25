package controle.obstaculovirtual;

public abstract class Obstaculo {
	
	private String imagem;
	
	public Obstaculo(String imagem) {
		this.imagem = imagem;
	}

	public String getImagem() {
		return this.imagem;
	}

	public int getPontuacao() {
		return 0;
	}
	
}
