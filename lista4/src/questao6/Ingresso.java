package questao6;

public class Ingresso {
	private float valor;
	
	public Ingresso(float valor) {
		this.valor = valor;
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public String toString() {
		return "Valor: R$" + this.valor; 
	}
	
}
