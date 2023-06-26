package apresentacao.menuesquerdo.aspiradoropcoes;

import javax.swing.JButton;

import controle.aspiradorvirtual.AspiradorVirtualVermelho;

import apresentacao.Icone;

public class AspiradorVermelhoJButton extends JButton{

	private AspiradorVirtualVermelho aspiradorVirtualVermelho;
	
	public AspiradorVermelhoJButton() {
		this.aspiradorVirtualVermelho = new AspiradorVirtualVermelho();
		
		Icone icone = new Icone(this.aspiradorVirtualVermelho.getImagem());
		
		this.setIcon(icone.getIcon(50, 50));
		
	}
	
}
