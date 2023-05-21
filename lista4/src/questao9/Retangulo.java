package questao9;

public class Retangulo extends Forma {
	private float altura;
	private float largura;
	
	public Retangulo(String nome, float altura, float largura) {
		super(nome);
		
		this.altura = altura;
		this.largura = largura;
		
	}
	
	public float calcularArea() {
		return this.altura * this.largura;
	}
}
