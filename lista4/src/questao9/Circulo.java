package questao9;

public class Circulo extends Forma {
	private float raio;
	
	public Circulo(String nome, float raio) {
		super(nome);
		
		this.raio = raio;
		
	}
	
	public float calcularArea() {
		return (float) (this.raio * this.raio * 3.14);
	}
}
