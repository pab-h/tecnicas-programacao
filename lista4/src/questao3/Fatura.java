package questao3;

public class Fatura {
	private int numero;
	private String descricao;
	private int quantidade;
	private float precoUnitario;
	private float precoTotal;
	
	public Fatura(int numero, String descricao, int quantidade, float precoUnitario) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		
		if (quantidade < 0) {
			this.quantidade = 0;
		}
		
		if (precoUnitario < 0) {
			this.precoUnitario = 0;
		}
		
		this.precoTotal = this.quantidade * this.precoUnitario;
		
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			this.quantidade = 0;
			
			return;
		}
		
		this.quantidade = quantidade;
	}

	public float getPrecoUnitario() {
		return this.precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
		
		if (precoUnitario < 0) {
			this.precoUnitario = 0;
			
			return;
		}
		
	}

	public float getPrecoTotal() {
		return this.precoTotal;
	}

	public void setPrecoTotal(int precoTotal) {
		this.precoTotal = precoTotal;
	}
	
	public double getValorFatura() {
		this.precoTotal = this.quantidade * this.precoUnitario;
		
		return (double) this.precoTotal;
	}
	
	public void setDesconto(int desconto) {
		float fatorDesconto = desconto / 100;
		this.precoUnitario *= 1 - fatorDesconto;
	}
	
}
