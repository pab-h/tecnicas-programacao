package apresentacao.menudireito.aspiradoropcoes;

import javax.swing.JButton;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtualVermelho;

import apresentacao.Icone;

public class AspiradorVermelhoJButton extends AspiradorJButton {

	
	public AspiradorVermelhoJButton(Gerenciador gerenciador) {
		super(gerenciador, new AspiradorVirtualVermelho());
		
		Icone icone = new Icone(this.getAspiradorVirtual().getImagem());
		
		this.setIcon(icone.getIcon(50, 50));
		
	}
	
}
