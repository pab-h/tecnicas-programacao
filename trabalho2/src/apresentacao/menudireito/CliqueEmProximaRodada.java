package apresentacao.menudireito;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import apresentacao.Icone;
import apresentacao.menudireito.aspiradoropcoes.AspiradorJButton;
import apresentacao.menudireito.aspiradoropcoes.AspiradoresOpcoes;
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
	private Contagem contagem;
	private AspiradoresOpcoes aspiradoresOpcoes;
	
	public CliqueEmProximaRodada(Gerenciador gerenciador, Tabuleiro tabuleiro, JLabel pontuacaoJLabel, Contagem contagem, AspiradoresOpcoes aspiradoresOpcoes) {
		this.gerenciador = gerenciador;
		this.tabuleiro = tabuleiro;
		this.pontuacaoJLabel = pontuacaoJLabel;
		this.contagem = contagem;
		this.aspiradoresOpcoes = aspiradoresOpcoes;
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
	
	
	private void mostrarIconesObstaculosNosAspiradores() {
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
	
	private void marcarCelulaComObstaculosNosAspiradores() {
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
	
	private void atualizarPontuacao() {
		this.pontuacaoJLabel.setText("" + this.gerenciador.getPontuacaoTotal() + "");
	}
	
	private void atualizarContagem() {
		this.contagem.getPoeirasEncontradasJLabel().setText("" + this.gerenciador.getTotalPoeirasEncontradas() + "");
		this.contagem.getAlunosEncontradosJLabel().setText("" + this.gerenciador.getTotalAlunosEncontrados()  + "");
	}
	
	public void habilitarBotoesDosAspiradores() {
		for(AspiradorVirtual aspiradorVirtual: this.gerenciador.getAspiradoresVirtuais()) {
			CelulaVirtual celulaVirtual = aspiradorVirtual.getCelulaVirtualAtual();
			
			celulaVirtual.setAspiradorVirtual(null);
			aspiradorVirtual.setCelulaVirtualAtual(null);
		}
		
		for(AspiradorJButton aspiradorJButton: this.aspiradoresOpcoes.getOpcoesJButton()) {
			aspiradorJButton.setEnabled(true);
		}
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (!this.gerenciador.todosAspiradoresPosicionados()) {
			JOptionPane.showMessageDialog(
				null, 
				"Todos os aspiradores precisam estar posicionados", 
				"Error", 
				JOptionPane.ERROR_MESSAGE
			);
			return; 
		}
		
		this.apagarIconesDosAspiradores();
		this.mostrarIconesObstaculosNosAspiradores();
		this.marcarCelulaComObstaculosNosAspiradores();
		this.atualizarPontuacao();
		this.atualizarContagem();
		this.habilitarBotoesDosAspiradores();
		this.gerenciador.setRodadas(this.gerenciador.getRodadas() + 1);
	}
	
}
