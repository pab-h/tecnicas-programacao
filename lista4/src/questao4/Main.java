package questao4;

public class Main {

	public static void main(String[] args) {
		Produto sapato = new Produto("Sapato Caro", (float) 1110.2, 10);
		
		sapato.comprarProduto();
		
		System.out.println(sapato);

	}

}
