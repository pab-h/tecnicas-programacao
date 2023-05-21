package questao9;

public class Triangulo extends Forma {
	private float base;
	private float altura;

	public Triangulo(String nome, float base, float altura) {
		super(nome);
		
		this.base = base;
		this.altura = altura;
	}

	@Override
	public float calcularArea() {
		return (float) ((this.base * this.altura) / 2);
	}
	
}
