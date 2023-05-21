package questao7;

public class Main {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Jose", 1300);
		Gerente gerente = new Gerente("Jose Valdo", 2600, "TI");
		Vendedor vendedor = new Vendedor("Jose Valdo Antonio", 1300,(float) 0.25);
		
		System.out.println(empregado);
		System.out.println(gerente);
		System.out.println(vendedor);
		
		
	}
}
