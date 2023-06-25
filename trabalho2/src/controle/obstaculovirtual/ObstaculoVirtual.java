package controle.obstaculovirtual;

public abstract class ObstaculoVirtual {
	
	private String imagem;
	
	public ObstaculoVirtual(String imagem) {
		this.imagem = imagem;
	}

	public String getImagem() {
		return this.imagem;
	}

	public int getPontuacao() {
		return 0;
	}
	
}
