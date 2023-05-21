package questao8;

public class ContaEspecial extends ContaCorrente {
	private float limiteCredito;
	
	public ContaEspecial(float limiteCredito) {
		super();
		
		this.limiteCredito = limiteCredito;
	}
	
	public void sacar(float valor) {
		if (this.saldo + this.limiteCredito - valor >= 0) {
			this.saldo -= valor;
		}
	}
	
}
