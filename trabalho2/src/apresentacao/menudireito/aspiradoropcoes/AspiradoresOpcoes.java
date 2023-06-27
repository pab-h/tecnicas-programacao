package apresentacao.menudireito.aspiradoropcoes;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import controle.Gerenciador;

public class AspiradoresOpcoes extends JPanel {

	public AspiradoresOpcoes(Gerenciador gerenciador) {
		
		this.setLayout(new FlowLayout());
		
		this.add(new AspiradorVermelhoJButton(gerenciador));
		this.add(new AspiradorPretoJButton(gerenciador));
		this.add(new AspiradorAzulJButton(gerenciador));
		
		
		this.setVisible(true);
	}
	
}
