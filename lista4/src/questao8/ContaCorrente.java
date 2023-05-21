package questao8;

public class ContaCorrente {
	protected float saldo;
	
	public ContaCorrente() {
		this.saldo = 0;
	}
	
	public void sacar(float valor) {
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
		}
	}
	
}
