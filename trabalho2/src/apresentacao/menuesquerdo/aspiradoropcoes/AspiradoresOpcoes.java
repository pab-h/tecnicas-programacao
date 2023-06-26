package apresentacao.menuesquerdo.aspiradoropcoes;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class AspiradoresOpcoes extends JPanel {

	public AspiradoresOpcoes() {
		
		this.setLayout(new FlowLayout());
		
		this.add(new AspiradorVermelhoJButton());
		this.add(new AspiradorPretoJButton());
		this.add(new AspiradorAzulJButton());
		
		
		this.setVisible(true);
	}
	
}
