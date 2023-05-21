package questao7;

public class Vendedor extends Empregado {

	private float comissao;
	
	public Vendedor(String nome, float salario, float comissao) {
		super(nome, salario);
		
		this.comissao = comissao;
	}
	
	public float calcularSalario() {
		return (float) (this.salario * (1 + this.comissao));
	}
	
	public String toString() {
		return super.toString() + " comissao = "+ this.comissao + "; salario com comissao = " + this.calcularSalario() + ";";
	}
	
}
