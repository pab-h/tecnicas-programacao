package controle.obstaculovirtual;

import controle.tabuleirovirtual.CelulaVirtual;

public final class AlunoVirtual extends ObstaculoVirtual {

	public AlunoVirtual(CelulaVirtual celulaVirtualAtual) {
		super("./midia/aluno.png", celulaVirtualAtual);
	}

	@Override
	public int getPontuacao() {
		return 10;
	}
	
}
