package apresentacao.menudireito;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.JLabel;

import apresentacao.Icone;
import apresentacao.tabuleiro.Celula;
import apresentacao.tabuleiro.Tabuleiro;

import controle.Gerenciador;
import controle.aspiradorvirtual.AspiradorVirtual;
import controle.obstaculovirtual.ObstaculoVirtual;
import controle.tabuleirovirtual.CelulaVirtual;

public class CliqueEmProximaRodada implements ActionListener {

	private Gerenciador gerenciador;
	private Tabuleiro tabuleiro;
	private JLabel pontuacaoJLabel;
	
	public CliqueEmProximaRodada(Gerenciador gerenciador, Tabuleiro tabuleiro, JLabel pontuacaoJLabel) {
		this.gerenciador = gerenciador;
		this.tabuleiro = tabuleiro;
		this.pontuacaoJLabel = pontuacaoJLabel;
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
	
	public void atualizarPontuacao() {
		int pontuacaoTotal = 0;
		
		for(AspiradorVirtual aspiradorVirtual: this.gerenciador.getAspiradoresVirtuais()) {
			pontuacaoTotal += aspiradorVirtual.getPontuacao();
		}
		
		this.pontuacaoJLabel.setText(""+ pontuacaoTotal + "");
		
	}
	
	public void mostrarIconesObstaculosNosAspiradores() {
		for(AspiradorVirtual aspiradorVirtual: this.gerenciador.getAspiradoresVirtuais()) {
			CelulaVirtual celulaVirutal = aspiradorVirtual.getCelulaVirtualAtual();
			
			if (!celulaVirutal.semObstaculo()) {
				Celula celula = this.tabuleiro.getCelula(
					celulaVirutal.getLinha(), 
					celulaVirutal.getColuna()
				);

				ObstaculoVirtual obstaculoVirtual = celulaVirutal.getObstaculoVirtual(); 
				
				Icone iconeObstaculo = new Icone(obstaculoVirtual.getImagem());
				
				celula.setIcon(iconeObstaculo.getIcon(50, 50));
				
			}
		}
	}
	
	public void marcarCelulaComObstaculosNosAspiradores() {
		for(AspiradorVirtual aspiradorVirtual: this.gerenciador.getAspiradoresVirtuais()) {
			CelulaVirtual celulaVirutal = aspiradorVirtual.getCelulaVirtualAtual();
			
			Celula celula = this.tabuleiro.getCelula(
				celulaVirutal.getLinha(), 
				celulaVirutal.getColuna()
			);

			celula.setBackground(Color.PINK);
			celula.removeActionListener(celula.getActionListeners()[0]);
				
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		this.apagarIconesDosAspiradores();
		this.mostrarIconesObstaculosNosAspiradores();
		this.marcarCelulaComObstaculosNosAspiradores();
		this.atualizarPontuacao();
	}
	
}
