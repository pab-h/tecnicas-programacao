package apresentacao.menudireito.aspiradoropcoes;

import javax.swing.JButton;

import apresentacao.Icone;
import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtualPreto;

public class AspiradorPretoJButton extends AspiradorJButton {

	private AspiradorVirtualPreto aspiradorVirtualPreto;
	
	public AspiradorPretoJButton(Gerenciador gerenciador) {
		super(gerenciador, gerenciador.getAspiradoresVirtuais().get(1)); 
		
		Icone icone = new Icone(this.getAspiradorVirtual().getImagem());
		
		this.setIcon(icone.getIcon(50, 50));
		
		
	}
	
}
