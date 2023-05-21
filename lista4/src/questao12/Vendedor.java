package questao12;

public class Vendedor extends Empregado {
	
	private float valorVendas;
	private float comissao;

	public Vendedor(String nome, int codigoSetor, float salarioBase, float imposto, float valorVendas, float comissao) {
		super(nome, codigoSetor, salarioBase, imposto);
		
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		
	}
	
	@Override
	public float calcularSalario() {
		return super.calcularSalario() + this.comissao;
	}
	
}
