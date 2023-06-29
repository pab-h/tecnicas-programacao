package apresentacao.menudireito;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.Gerenciador;
import controle.RelatorioVirtual;

public class Sair implements ActionListener {

	private Gerenciador gerenciador;
	
	public Sair(Gerenciador gerenciador) {
		this.gerenciador = gerenciador;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		RelatorioVirtual relatorioVirtual = new RelatorioVirtual();
		
		relatorioVirtual.atualizar(this.gerenciador);
		
		System.exit(200);
		
	}
	
}
