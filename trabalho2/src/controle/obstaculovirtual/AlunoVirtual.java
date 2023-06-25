package controle.obstaculovirtual;

public final class AlunoVirtual extends Obstaculo {

	public AlunoVirtual() {
		super("./midia/aluno.png");
	}

	@Override
	public int getPontuacao() {
		return 10;
	}
	
}
