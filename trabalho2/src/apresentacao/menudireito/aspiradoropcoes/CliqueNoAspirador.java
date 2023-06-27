package apresentacao.menudireito.aspiradoropcoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtual;

public class CliqueNoAspirador implements ActionListener{
	
	private AspiradorJButton aspiradorJButton;
	private Gerenciador gerenciador;
	
	public CliqueNoAspirador(Gerenciador gerenciador, AspiradorJButton aspiradorJButton) {
		this.aspiradorJButton = aspiradorJButton;
		this.gerenciador = gerenciador;
	}
	
	
	public void actionPerformed(ActionEvent e) {
		AspiradorVirtual aspiradorVirtualSelecionado = this.aspiradorJButton.getAspiradorVirtual();
		this.gerenciador.setAspiradorVirtualSelecionado(aspiradorVirtualSelecionado);
		this.aspiradorJButton.setEnabled(false);
	}

}
