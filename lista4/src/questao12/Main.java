package questao12;

public class Main {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("Jose", 1, 2100, (float) 0.10, 100, 1);

		System.out.println(vendedor.calcularSalario());
			
	}

}
