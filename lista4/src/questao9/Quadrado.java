package questao9;

public class Quadrado extends Forma {
	private float largura;
	
	public Quadrado(String nome, float largura) {
		super(nome);
		
		this.largura = largura;
		
	}
	
	@Override
	public float calcularArea() {
		return this.largura * this.largura;
	}

}
