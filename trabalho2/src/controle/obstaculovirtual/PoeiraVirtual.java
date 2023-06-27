package controle.obstaculovirtual;

import controle.tabuleirovirtual.CelulaVirtual;

public class PoeiraVirtual extends ObstaculoVirtual {

	public PoeiraVirtual(CelulaVirtual celulaVirtualAtual) throws Exception {
		super("./midia/poeira.png", celulaVirtualAtual);
	}

	@Override
	public int getPontuacao() {
		return -15;
	}
	
}
