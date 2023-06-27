package apresentacao.menudireito.aspiradoropcoes;

import javax.swing.JButton;

import apresentacao.Icone;
import controle.aspiradorvirtual.AspiradorVirtualAzul;

public class AspiradorAzulJButton extends JButton {

	private AspiradorVirtualAzul aspiradorAzulVirtual;
	
	public AspiradorAzulJButton() {
		this.aspiradorAzulVirtual = new AspiradorVirtualAzul();
		
		Icone icone = new Icone(this.aspiradorAzulVirtual.getImagem());
		
		this.setIcon(icone.getIcon(50, 50));
		
	}
	
}
