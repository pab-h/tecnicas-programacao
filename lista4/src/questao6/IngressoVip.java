package questao6;

public class IngressoVip extends Ingresso {
	private float valorAdicional;

	public IngressoVip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public String toString() {
		return "Valor: R$" + (this.getValor() + this.valorAdicional);
	}
	
}
