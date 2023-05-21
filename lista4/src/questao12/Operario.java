package questao12;

public class Operario extends Empregado {
	
	private float valorProducao;
	private float comissao;
	
	public Operario(String nome, int codigoSetor, float salarioBase, float imposto, float valorProducao, float comissao) {
		super(nome, codigoSetor, salarioBase, imposto);
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		
	}
	
	@Override
	public float calcularSalario() {
		return super.calcularSalario() + this.valorProducao * this.comissao;
	}
	
}
