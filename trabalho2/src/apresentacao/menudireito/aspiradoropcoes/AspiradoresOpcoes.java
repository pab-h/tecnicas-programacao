package apresentacao.menudireito.aspiradoropcoes;

import java.util.ArrayList;

import java.awt.FlowLayout;

import javax.swing.JPanel;

import controle.Gerenciador;

public class AspiradoresOpcoes extends JPanel {

	private ArrayList<AspiradorJButton> opcoesJButton;
	
	public AspiradoresOpcoes(Gerenciador gerenciador) {
		
		this.setLayout(new FlowLayout());
		
		this.opcoesJButton = new ArrayList<AspiradorJButton>();
		
		this.opcoesJButton.add(new AspiradorVermelhoJButton(gerenciador));
		this.add(this.opcoesJButton.get(0));
		
		this.opcoesJButton.add(new AspiradorPretoJButton(gerenciador));
		this.add(this.opcoesJButton.get(1));
		
		this.opcoesJButton.add(new AspiradorAzulJButton(gerenciador));
		this.add(this.opcoesJButton.get(2));
		
		this.setVisible(true);
	}
	
	public ArrayList<AspiradorJButton> getOpcoesJButton() {
		return this.opcoesJButton;
	}
	
}
