package apresentacao.menudireito;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import apresentacao.tabuleiro.Celula;
import apresentacao.tabuleiro.Tabuleiro;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtual;
import controle.tabuleirovirtual.CelulaVirtual;

public class CliqueEmProximaRodada implements ActionListener {

	private Gerenciador gerenciador;
	private Tabuleiro tabuleiro;

	public CliqueEmProximaRodada(Gerenciador gerenciador, Tabuleiro tabuleiro) {
		this.gerenciador = gerenciador;
		this.tabuleiro = tabuleiro;
	}
	
	private void apagarIconesDosAspiradores() {
		for(AspiradorVirtual aspiradorVirtual: this.gerenciador.getAspiradoresVirtuais()) {
			CelulaVirtual celulaVirutal = aspiradorVirtual.getCelulaVirtualAtual();
			
			Celula celula = this.tabuleiro.getCelula(
				celulaVirutal.getLinha(), 
				celulaVirutal.getColuna()
			);
			
			celula.setIcon(null);
			
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		this.apagarIconesDosAspiradores();
	}
	
}
