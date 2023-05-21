package questao2;

public class Main {

	public static void main(String[] args) {
		Empregado a = new Empregado("Jose", "Valdo", 1200);
		Empregado b = new Empregado("Valdo", "Jose", 2400);
		
		System.out.println(a.getSalarioMensal());
		System.out.println(b.getSalarioMensal());
		
		a.setSalarioMensal((float) (a.getSalarioMensal() * 1.10));
		b.setSalarioMensal((float) (a.getSalarioMensal() * 1.10));		
		
		System.out.println(a.getSalarioMensal());
		System.out.println(b.getSalarioMensal());
	
	}

}
