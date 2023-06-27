package apresentacao.menudireito.aspiradoropcoes;

import javax.swing.JButton;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtual;

public class AspiradorJButton extends JButton {
	
	private AspiradorVirtual aspiradorVirtual;
	
	public AspiradorJButton(Gerenciador gerenciador, AspiradorVirtual aspiradorVirtual) {
		this.aspiradorVirtual = aspiradorVirtual;
		this.addActionListener(new CliqueNoAspirador(gerenciador, this));
	}
	
	public AspiradorVirtual getAspiradorVirtual() {
		return this.aspiradorVirtual;
	}

}
