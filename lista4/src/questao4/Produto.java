package questao4;

public class Produto {
	private String nome;
	private float preco;
	private int quantidade;
	
	public Produto(String nome, float preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
		
		if (this.preco > 100 && this.preco <= 200) {
			this.preco = (float) (this.preco * 0.90);
		}
		
		if (this.preco > 200 && this.preco <= 500) {
			this.preco = (float) (this.preco * 0.80);
		}	
		
		if (this.preco > 500) {
			this.preco = (float) (this.preco * 0.75);
		}
		
	}

	public void comprarProduto() {
		this.quantidade--;
	}

	public String toString() {
		return "Produto " + this.nome + "; preco: R$" + this.preco + ";";
	}
	
}
