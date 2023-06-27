package apresentacao.menudireito.aspiradoropcoes;

import apresentacao.Icone;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtualAzul;

public class AspiradorAzulJButton extends AspiradorJButton {

	public AspiradorAzulJButton(Gerenciador gerenciador) {
		super(gerenciador, gerenciador.getAspiradoresVirtuais().get(0));
		
		Icone icone = new Icone(this.getAspiradorVirtual().getImagem());
		
		this.setIcon(icone.getIcon(50, 50));
		
	}
	
}
