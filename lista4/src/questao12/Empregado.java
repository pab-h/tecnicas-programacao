package questao12;

public class Empregado extends Pessoa {

	public int codigoSetor;
	public float salarioBase;
	public float imposto;
	
	public Empregado(String nome, int codigoSetor, float salarioBase, float imposto) {
		super(nome);
		
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public float calcularSalario() {
		return (1 - this.imposto) * this.salarioBase;
	}

}
