package apresentacao.menuesquerdo.aspiradoropcoes;

import javax.swing.JButton;

import apresentacao.Icone;
import controle.aspiradorvirtual.AspiradorVirtualPreto;

public class AspiradorPretoJButton extends JButton {

	private AspiradorVirtualPreto aspiradorVirtualPreto;
	
	public AspiradorPretoJButton() {
		this.aspiradorVirtualPreto = new AspiradorVirtualPreto();
		
		Icone icone = new Icone(this.aspiradorVirtualPreto.getImagem());
		
		this.setIcon(icone.getIcon(50, 50));
		
		
	}
	
}
